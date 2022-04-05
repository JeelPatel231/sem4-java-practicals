class time {
    int hours;
    int minutes;
    int seconds;

    time(int hours,int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void add(time t){
        // add seconds and increment minutes if > 60
        this.seconds += t.seconds;
        if(this.seconds >= 60){
            this.minutes++;
            this.seconds -= 60;
        }

        // add minutes and increment hours if > 60
        this.minutes += t.minutes;
        if(this.minutes >= 60){
            this.hours++;
            this.minutes -= 60;
        }

        // add hours
        this.hours += t.hours;
    }

    void display(){
        System.out.printf("TIME: %d : %d : %d\n",this.hours,this.minutes,this.seconds);
    }
}

class co2q1{
    public static void main(String[] args) {
        time t1 = new time(11, 59, 55);
        time t2 = new time(0, 0, 5);

        t1.add(t2);

        t1.display();

    }
}