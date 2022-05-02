import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    Question2 quest = new Question2();
    char[] arr = {'a','b','a','d','c','a'};

    @Test
    void setStateTest() {
        assertEquals("NORMAL",quest.States(arr[0]));
        for(int i= 1; i<=3;i++){
            if(i==3){
                assertEquals("NORMAL",quest.States(arr[i]));

            }else {

                assertEquals("ALARM", quest.States(arr[i]));
            }


        }





                assertEquals("UPDATE", quest.States(arr[4]));



        assertEquals("NORMAL",quest.States(arr[5]));


    }
}