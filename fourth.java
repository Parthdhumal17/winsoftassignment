
class duplicate{  
    public static void main(String[] args) {  
        String str = "Parth Shashikant Dhumal";  
        int count;  
        char carr[] = str.toCharArray();  
         
        System.out.println("Duplicate characters in a given string: ");  
        for(int i = 0; i <carr.length; i++) {  
            count = 1;  
            for(int j = i+1; j <carr.length; j++) {  
                if(carr[i] == carr[j] && carr[i] != ' ') {  
                    count++;  
                    carr[j] = '0';  
                }  
            }       
            if(count > 1 && carr[i] != '0')  
                System.out.println(carr[i]);  
        }
    }  
}  
