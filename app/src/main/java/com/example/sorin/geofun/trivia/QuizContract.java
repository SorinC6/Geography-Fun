package com.example.sorin.geofun.trivia;

import android.provider.BaseColumns;

public final class QuizContract {

    //am facut contstructorul private pentru a ma asigura ca nu creez nici-o instanta a clasei si nu fac altceva cu ea , nu e necesar dar e mai sigur pe viitor
    private QuizContract(){

    }

    //implementam si interfata BaseColumn oferita de android pentru a putea a avea id in tabel ,desi l-am putea crea si noi dar are un nume cu _
    public static class QuestionsTable implements BaseColumns{
        public static final String TABLE_NAME="quiz_question"; //static pentru ca sa nu imi mai fac instante - acesta va fi numele tabelului
        public static final String COLUMN_QUESTION="question";
        public static final String COLUMN_OPTION1="option1";
        public static final String COLUMN_OPTION2="option2";
        public static final String COLUMN_OPTION3="option3";
        public static final String COLUMN_ANSWER_NR="answer_nr";


    }

}