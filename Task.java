import java.io.IOException;


public class Task {
	static String path="/home/jitendra/Downloads/";
	public void process_1(String command) throws IOException
	{
		
	ProcessBuilder processBuilder = new ProcessBuilder("/bin/sh", "-c" ,command);
	processBuilder.redirectErrorStream(true);
	processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
	processBuilder.start();
	}

	
	public void transcode(String path) 
	{
	try {
		    String command ="ffmpeg -i "+path+"'"+"sample.mp4"+"' "+path+"'"+"test4.avi"+"'";
			process_1(command);
		} catch (IOException e) 
	      {
			e.printStackTrace();
		  }
		
	}
	
	public void screenshot(String path) 
	{
	try {   
		    			
		    String command ="ffmpeg -i "+path+"sample.mp4"+" "+"-ss 00:00:02 -vframes 1 "+""+path+"output22.jpg";
		   process_1(command);
		} catch (IOException e) 
	      {
			e.printStackTrace();
		  }
		
	}
	public void video_split(String path) 
	{ 
	try {   
		    String command ="ffmpeg -i "+path+"sample.mp4"+" "+"-ss 00:00:00 -to 00:00:05 -c copy "+""+path+"small1.mp4";
		     System.out.println(command);
		    process_1(command);
		} catch (IOException e) 
	      {
			e.printStackTrace();
		  }
		
	}
	

	public static void main(String[] args) {
		
		Task cmd=new Task();
		//cmd.screenshot(path);
		//cmd.display();
		 //cmd.transcode(path);
		cmd.video_split(path);
	}


}
