package com.tailink81.hahow_mykotlin

class Hello {

}

fun main(){

    val jack=Person("Joey",92.5f,1.7f)
    jack.hello();
    //jack.weight=65.6f;
    //jack.height=1.7f;
    println(jack.bmi());

    val hank=Person("Hank",70f,1.75f)
    println(hank.name+","+hank.bmi())
    //bmi
    val w=92.5f;
    val h=1.7f;
    val bmi=w/(h*h);
    println("bmi:"+bmi);

//    println("Hello Kotlin!!")
//
//    val age=20
//    println(age.inc());
//    println(age)
//    var name="Joey"
//    println(name.get(1))
//    name="Jack"
//    println(name)
//    val population:Long=9999;
//    val weight:Float=65.5f
//    val isAdult=false;
//    val c='A'
//    println(c)
    //JoeyChen0801
    //ufak0029@ms5.hinet.net
    //2jdiojxl630801
    //https://github.com/JoeyChen0801/hahow_mykotlin.git
}