import javax.management.MBeanRegistration

fun main(){
names(listOf("sam","amina","jack","mollen","caro","cate","Kishoyan","sande","peter","john"))
    var w=peoplesHeight(listOf(20,49,21,23,57,39))
    println(w.sum())
    println(w.average())
    var x=Persons( "Winnie Mwangi",22,30,50)
    var y=Persons( "Faith Mutua",25,17,48)
    var z=Persons( "Cate Kanini",40,41,40)
    var t=Persons( "mollen wambui",60,36,60)
    var u=Persons( "samuel mutua",30,26,40)
    var v=Persons( "cheko sharon",80,31,56)
    var s= listOf<Persons>(x,y,z,t,u,v)
    var descending=s.sortedByDescending { person->  person.age}
    println(descending)
    var a=Cars("KDCE",5)
    var b=Cars("KACE",4)
    var c=Cars("KFCE",3)
    var d=Cars("KCDE",2)
    var f= listOf<Cars>(a,b,c,d)
    var r=AverageMileange(f)
    println(v)

}
fun names(name:List<String>):List<String>{
    name.forEachIndexed { index, s ->
        if (index%2==0)
            println(s)
    }
    return name
}
fun peoplesHeight(Height:List<Int>):List<Int>{
    return Height

}
data class Persons(var name:String,var age:Int,var height:Int,var weight:Int){

}
fun output(people: List<String>):List<String>{
    return people
}
data class Cars(var registration:String,var mileange:Int)
fun AverageMileange(name:List<Cars>):Int {
    var average = 0
    name.forEach { cars ->
        average+=cars.mileange
    }
    return average/name.count()
}