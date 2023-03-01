package javajungsuk_basic.chapter6;


import java.util.ArrayList;
import java.util.List;

public class Student {
    String name; //학생이름
    int ban; //반
    int no; //번호
    int kor; //국어점수
    int eng; //영어점수
    int math; //수학점수

    Student(){
        this("김철수", 3, 1, 80, 80, 80);
    }
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        return name + ", " + ban + ", " + no + ", " + kor
                + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }

    int getTotal() {
        return this.kor + this.eng + this.math;
    }

    float getAverage() {
        return Math.round(getTotal() / 3f * 10f) / 10f;
    }
}
