fun main(){
    for (i in 0..4){
        for (k in 4 downTo i){
            print(" ")
        }
        for (j in 0..i){
            print("* ")
        }
        println("")
    }
    for (a in 0..4){
        for (b in 0..a){
            print(" ")
        }
        for (c in 3 downTo a){
            print(" *")
        }
        println("")
    }
}


