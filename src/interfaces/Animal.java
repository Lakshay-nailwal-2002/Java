package interfaces;

interface FlightEnabled{
    void takeOff();
    void land();
    void fly();
}

interface Trackable{
    // complie time error --> void trace(){}
    void track();
}

public abstract class Animal{

    public abstract void move();
    
}

