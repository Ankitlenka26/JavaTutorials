package com.oops;

public interface Resizable {
    //    void drag();
    // if we change the resize function here
    // dragger class is not using the resize function but still gets complied again
    // because the UIWidget interface changed . So to decrease such things we use Interface segregation Principle
    void resize(int size);
}
