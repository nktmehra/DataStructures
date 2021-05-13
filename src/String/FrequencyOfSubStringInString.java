package String;

public class FrequencyOfSubStringInString {

    public static void frequency(String str, String sub){
        int count =0;
        int pos =0;
        int i =0;

        while(i<str.length()){
            pos = str.indexOf(sub,i);
            if(pos!=-1){
                count++;
                i =pos+1;
            }else{
                break;
            }
        }
        if(count==0){
            System.out.println("Doesn't repeat");
        }else{
            System.out.println("No of times it repeat: "+count);
        }
    }

    public static void main(String[] args) {
        frequency("hi highest","hi");
    }

}
