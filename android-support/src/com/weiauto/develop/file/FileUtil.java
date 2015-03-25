package com.weiauto.develop.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;

import org.apache.http.protocol.HTTP;

import android.app.Activity;
import android.util.Log;

public class FileUtil {
	private FileUtil(){}
	
	public static String readFromFile(String path) {

	    String ret = "";

	    try {
	        InputStream inputStream = new FileInputStream(path);

	        if ( inputStream != null ) {
	            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,HTTP.UTF_8);
	            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	            String receiveString = "";
	            StringBuilder stringBuilder = new StringBuilder();

	            while ( (receiveString = bufferedReader.readLine()) != null ) {
	                stringBuilder.append(receiveString);
	            }
	            bufferedReader.close();
	            inputStreamReader.close();
	            inputStream.close();
	            ret = stringBuilder.toString();
	        }
	    }
	    catch (FileNotFoundException e) {
	        Log.e("file", "File not found: " + e.toString());
	    } catch (IOException e) {
	        Log.e("file", "Can not read file: " + e.toString());
	    }

	    return ret;
	}
	
	public static boolean writeFile(String path,String content) {
		boolean isSuccess = true;
		
		try {
			File file = new File(path);
			if(!file.exists()|| file.isDirectory()){
				file.createNewFile();
			}
			OutputStream outputStream = new FileOutputStream(path);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, HTTP.UTF_8);
			outputStreamWriter.write(content);
			outputStreamWriter.flush();
			outputStream.flush();
			outputStreamWriter.close();
			outputStream.close();
		} catch (UnsupportedEncodingException e) {
			isSuccess = false;
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			isSuccess = false;
			e.printStackTrace();
		}finally{
			return isSuccess;
		}
		
	}
	
	public static boolean copyFile(String fromPath,String toPath) throws IOException{
//		File inputFile = new File(fromPath);
//		if(inputFile.exists()){
//			InputStream inputStream = new FileInputStream(fromPath);
//			OutputStream outputStream = new FileOutputStream(toPath);
//			File toFile = new File(toPath);
//			if(toFile.exists() && toFile.isFile()){
//				toFile.delete();
//			}
//			byte[] buffer = new byte[2048];
//			int length = inputStream.read(buffer);
//			while(length>0){
//				outputStream.write(buffer);
//				length = inputStream.read(buffer);
//			}
//			
//			outputStream.flush();
//			outputStream.close();
//			inputStream.close();
//		}
//		return true;
		
		File inputFile = new File(fromPath);
		if(!inputFile.exists()||inputFile.isDirectory()){
			return false;
		}
		
		FileInputStream fi = null;
		
		FileOutputStream fo = null;
		
		FileChannel in = null;
		
		FileChannel out = null;
		
		try {
			
			fi = new FileInputStream(fromPath);
			
			fo = new FileOutputStream(toPath);
			
			in = fi.getChannel();//得到对应的文件通道
			
			out = fo.getChannel();//得到对应的文件通道
			
			in.transferTo(0, in.size(), out);//连接两个通道，并且从in通道读取，然后写入out通道
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				fi.close();
				
				in.close();
				
				fo.close();
				
				out.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}

		return true;
	}

    public static String readAsset(Activity activity,String fileName){
        StringBuffer sb = new StringBuffer();
        try {
            InputStream inputStream = activity.getAssets().open(fileName, Activity.MODE_PRIVATE);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, HTTP.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String readString = null;
            while((readString = bufferedReader.readLine())!=null){
                sb.append(readString);
            }

            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
	}
}
