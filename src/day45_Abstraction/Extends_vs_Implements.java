package day45_Abstraction;

//extends:
class C {

}

class A {

}

class B extends A {//multiple extends not possible

}

interface Z {

}

interface X {

}

interface Y extends X, Z {//multiple interface is allowed

}


//implements

class D implements X, Y, Z {//multiple implements allowed

}


public class Extends_vs_Implements extends A implements X, Y, Z {//first extends then implements

}
