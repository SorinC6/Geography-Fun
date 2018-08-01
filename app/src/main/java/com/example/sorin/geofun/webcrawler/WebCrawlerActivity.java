package com.example.sorin.geofun.webcrawler;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sorin.geofun.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;




public class WebCrawlerActivity extends AppCompatActivity {

    private Button backButon;
    public TextView textTitlu;
    public TextView textCrawler;


    private String info;

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webcrawler);

        //Intent intent=new Intent();

        //textTitlu.setText(info);

       // textCrawler.setMovementMethod(new ScrollingMovementMethod());
        textCrawler=findViewById(R.id.textInfoCrawler);
        textTitlu=findViewById(R.id.textTitlu);
        info=getIntent().getStringExtra("EXTRA_MESSAGE");
        Toast.makeText(getApplicationContext(),info,Toast.LENGTH_LONG).show();
        textTitlu.setText(info.toUpperCase());
        textCrawler.setMovementMethod(new ScrollingMovementMethod());
        //textCrawler.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

        new Doit().execute();

        //textCrawler.setText(getText());
        //textCrawler.setText(getText(info));
        //configurareJSoup();

       // getInfoSite(info);


    }

    public class Doit extends AsyncTask<Void,Void,Void>{

        String text=getInfo();
        StringBuilder stringBuilder=new StringBuilder();
        @Override
        protected Void doInBackground(Void... voids) {
            try {

                Document doc = Jsoup.connect("https://ro.wikipedia.org/wiki/"+text).get();
                //text=doc.text();
                Elements paragraf=doc.select("p");
                Element p=paragraf.first();
                Element second=paragraf.get(1);
                Element third=paragraf.get(2);
                stringBuilder.append(p.text()).append("\n\n").append(second.text()).append("\n\n").append(third.text());
//                text=p.text();
//                text1=second.text();
//                text2=third.text();
            }catch(Exception e){
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            textCrawler.setText(stringBuilder);
            //textTitlu.setText(getInfo());
        }
    }


    private void getInfoSite(String st){

        new Thread(new Runnable() {
            @Override
            public void run() {

                final StringBuilder textBuilder=new StringBuilder();

                try{
                    Document doc=Jsoup.connect("https://ro.wikipedia.org/wiki/").get();
                   // String title=doc.title();
                    //String body=doc.text();
                    Elements paragraf=doc.select("p");
                    //Element firstParagraf=paragraf.first();

                    Element p=paragraf.first();
                    textBuilder.append(p.text());

//                    for(Element p:paragraf){
//                        p=paragraf.get(1);
//                        textBuilder.append(p.text()).append("\n");
//                    }

                    //builder.append(title).append("\n");
                   // textBuilder.append(body);
                }catch(IOException e){
                    e.printStackTrace();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //textTitlu.setText(builder.toString());
                        textCrawler.setText(textBuilder.toString());
                    }
                });
            }
        }).start();
    }


}
