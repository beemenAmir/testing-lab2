import java.util.Objects;
import java.util.Scanner;
public class Question2 {
private int m =0;
private int h = 0;
private int D = 1;
private int M =1;
private int Y = 2000;
private String state = "NORMAL";
private String state1 = "TIME";
private String state2 ="MIN";
private String state3;
    public String getState(){
        return this.state;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setm(){
      this.m +=1;
        if(this.m >60){
            this.m = 0;
        }
    }
    public void seth(){
        this.h +=1;
        if(this.h >24){
            this.h =0;
        }
    }
    public void setD(){
        this.D +=1;
        if(this.M ==2){
            if(this.D <28) {
                this.D = 1;
            }
        }
        if(this.M == 4 || this.M ==6 || this.M ==9 || this.M==11){
            if(this.D >30){
                this.D = 1;
            }
        }else{
            if(this.D >31){
                this.D = 1;
            }
        }
    }
    public void setM(){
        this.M += 1;
        if(this.M>12){
            this.M = 1;
        }
    }
    public void setY(){
        this.Y += 1;
        if(this.Y==2100){
            this.Y = 2000;
        }
    }
    public void displayDate(){
        System.out.println(Y+"-"+M+"-"+D);
    }
    public void displayTime(){
        System.out.println(h+":"+m);
    }
    public String States(char input){
        switch(this.state){
        case "NORMAL":{
            if (input =='c'){setState("UPDATE");
            }
            if (input =='b'){setState("ALARM");}
            if (input =='a'){
                if (this.state1 =="TIME"){
                this.state1 = "DATE";
                displayDate();
            }else{
                    this.state1 ="TIME";
                    displayTime();
                }
            }
            return getState();
        }
        case "UPDATE":{
            if(input =='a'){
                if(Objects.equals(this.state2, "MIN")){
                    this.state2 ="HOUR";
                }
                if(Objects.equals(this.state2, "HOUR")){
                    this.state2 ="DAY";
                }
                if(Objects.equals(this.state2, "DAY")){
                    this.state2 ="MONTH";
                }
                if(Objects.equals(this.state2, "MONTH")){
                    this.state2 ="YEAR";
                }
                if(Objects.equals(this.state2, "YEAR")){
                    this.state = "NORMAL";
                }
                return getState();
            }
            if(input == 'b'){
                if(Objects.equals(this.state2, "MIN")){
                    setm();
                }
                if(Objects.equals(this.state2, "HOUR")){
                    seth();
                }
                if(Objects.equals(this.state2, "DAY")){
                    setD();
                }
                if(Objects.equals(this.state2, "MONTH")){
                    setM();
                }
                if(Objects.equals(this.state2, "YEAR")){
                    setY();
                }

            }
            if(input == 'd'){
                this.state = "NORMAL";
            }

        }
        case "ALARM":{
            this.state3 = "alarm";
            if (input == 'a'){
                this.state3 = "chime";
            }
            if (input == 'd'){
                this.state = "NORMAL";
            }
            return getState();
        }
    }
    return null;


    }

}

