import ca.lvin.books.jenkins.RandomWord
void echo() {
    RandomWord rw = new RandomWord(this)
    echo rw.get()
}

void test(){
    println "hi from test"
}