package oop.lesson22.relationship;


public class Animal {

}

class Mouse extends Animal { //  Mouse is animal. IS A RELATIONSHIP.
}


class Window {

}

class House {
    Window w = new Window();  // House has Window. HAS A RELATIONSHIP.
}