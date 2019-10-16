package forCheck;

public class Factory {
      public static Test CreateObject(String str) {
    	  if("a".equals(str)) 
    		  
    		 return new Test1();
		return null;
    	  
      }
}
