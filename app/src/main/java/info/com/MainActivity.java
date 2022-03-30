package info.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Veri tabanı bağlanti işlemleri
        /*İlk olarak android studio nun sağ üst köşesinde yer alan
        * hesap simgesine tıkayıp firebase de kullanacağımız google hesabımızı giryoruz
        * daha sonra tools sekmesinden Firebase ye tıklayıp asistanı açıyoruz açlan
        * asistandan realtime database yi seciyoruz ve Get started with realtime database yi
        * seçip connect your app to firebase deki butona tıklıyoruz bizi firebase sayfasına
        * yönlendiriyor oradan yeni bir proje ekleyip isim veriyoruz ve oluştururken
        * Choose or create a Google Analytics account  aşamasında google ads hesabını seçiyoruz
        * ve veri tabanını oluşturduktan sonra android studio otomatik şekilde bağlantı işlemlerini
        * tamamlıyor sonrasında android studio ya geri dönerek add realtime database to your app
        * deki butona tıklayıp gradle ye gerekli olan import ları eklemesi için onay veriyoruz ve
        * işlem bu kadar
        *  şimdi tek yapmamız gereken kisiler classını oluşturduktan sonra
        * aşağıdaki kodlar ile ekleme silme ve güncelleme
        * şlemlerini yapmak*/

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("kisiler");
        /* kisiler classına göre kayıt ekleme
        Kisiler kisi1=new Kisiler("","Ahmet",17);
        Kisiler kisi2=new Kisiler("","Mehmet",18);
        Kisiler kisi3=new Kisiler("","Seda",22);
        Kisiler kisi4=new Kisiler("","Faruk",15);
        Kisiler kisi5=new Kisiler("","Celal",16);
        Kisiler kisi6=new Kisiler("","Hilmi",40);
        Kisiler kisi7=new Kisiler("","Aysun",25);

        myRef.push().setValue(kisi1);
        myRef.push().setValue(kisi2);
        myRef.push().setValue(kisi3);
        myRef.push().setValue(kisi4);
        myRef.push().setValue(kisi5);
        myRef.push().setValue(kisi6);
        myRef.push().setValue(kisi7);
       */
        //kayıt silme
       // myRef.child("-MzOmlkmWxzLUMN1yk97").removeValue();

        //kayıt güncelleme
        Map<String,Object> bilgiler=new HashMap<>();
        bilgiler.put("kisi_ad","Aysunnnnn");
        bilgiler.put("kisi_yas",99);
        //bu kod firebase veritabanındaki id değeridir.
        myRef.child("-MzOmll16U4gXp3Evwi6").updateChildren(bilgiler);



    }
}