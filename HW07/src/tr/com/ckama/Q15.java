package tr.com.ckama;

public class Q15 {

}

interface Document {
}

interface Archieve extends Document {
}

interface File extends Document, Archieve {
}

class Collections {

}

class ArrayList extends Collections implements File, Document {

}

class Queue extends ArrayList {

}