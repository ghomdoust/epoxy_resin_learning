package ir.wccs.epoxy_resin_learning;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class about_us extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_pdf_view);

        pdfView =(PDFView)findViewById(R.id.pdfView);

        new RetrivePdfStream().execute("https://negargalleryart.ir/download/about_us.pdf");

    }

    class RetrivePdfStream extends AsyncTask <String,Void, InputStream>
    {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try{
                URL url = new URL(strings[0]);
                HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200)
                {
                    inputStream=new BufferedInputStream(urlConnection.getInputStream());

                }
            }

            catch (IOException e)
            {
                return null;
            }

            return inputStream;

        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();

        }
    }
}
