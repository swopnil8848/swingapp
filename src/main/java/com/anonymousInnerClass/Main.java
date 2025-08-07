package com.anonymousInnerClass;

public class Main {
    // anonymous class = an inner class without a name 
    //                   only a single object is create frm one
    //                  the object may have "extras" or "changes"
    //                  and no need to create a seperate innerclass
    //                  when it only need it once
    //                  helps us to avoid cluttering code with a class name

    //                  syntax is simlar to constructor expect that there is also class defination with a block of code
    //                  great for LISTENERS
    public static void main(String[] args) {

        // annonymous inner class example for overridding

        // Greeting greeting = new Greeting(){
        //     @Override
        //     public void Welcome(){
        //         System.out.println("Yo Bro");
        //     }
        // }; 
        // Greeting greeting2 = new Greeting();


        // greeting.Welcome();      
        // greeting2.Welcome();        
        
        
        MyFrame myFrame = new MyFrame();    
    }
}
