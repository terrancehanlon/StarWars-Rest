package hello;

 public class Tools {

	  public static String createId(){
	        
		  String _id = "";

	        for(int i = 0; i < 6; i++){
	            _id += Math.round(Math.random() * 9);
	        }

	        return _id;
	    }
}
