// import java.util.*;
// class Spike 
// {
//    public static void main(String[] args) 
//    {
//       JSONParser parser=new JSONParser();
//       String s = "{\"0\" : {\"Bangalore\" : 2 } }";
//       try{
//         Object obj = parser.parse(new FileReader("./paths.txt"));
//         JSONObject json = (JSONObject)obj;
//         // ArrayList list = (ArrayList)json; 
//         System.out.println("---------");
//         System.out.println(json.get("Bangalore"));
//         System.out.println("---------");

//          // JSONObject obj2 = (JSONObject)array.get(1);
//          // System.out.println("Field \"1\"");
//          // System.out.println(obj2.get("1"));    

//          // s = "{}";
//          // obj = parser.parse(s);
//          // System.out.println(obj);

//          // s= "[5,]";
//          // obj = parser.parse(s);
//          // System.out.println(obj);

//          // s= "[5,,2]";
//          // obj = parser.parse(s);
//          // System.out.println(obj);
//       }catch(Exception pe){
//          // System.out.println("position: " + pe.getPosition());
//       	System.out.println("*********************");
//         System.out.println(pe);
//       }
//    }
// }