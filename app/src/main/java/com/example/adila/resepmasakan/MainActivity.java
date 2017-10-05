package com.example.adila.resepmasakan;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.rv_resep);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        int[] gambarResep = {R.drawable.gambar1,
                R.drawable.gambar2,
                R.drawable.gambar3,
                R.drawable.gambar4,
                R.drawable.gambar5,
                R.drawable.gambar6,
                R.drawable.gambar7,
                R.drawable.gambar8,
                R.drawable.gambar9,
                R.drawable.gambar10};

        String[] judulResep = {"Kue Bawang",
                                "Kue Semprit",
                                "Kue Lidah Kucing",
                                "Kue Keju - Kastengel",
                                "Kue Nastar",
                                "Kue Sagu Keju",
                                "Kue Widaran Keju",
                                "Kue Putri Salju",
                                "Cheese Stick Pedas",
                                "Coklat Hati"};

        String[] deskripsiResep = {"Salah satu penganan khas Lebaran yang mudah dibuat dan tidak membutuhkan oven adalah kue bawang.",
                                    "Berbentuk bunga dan berhiaskan sukade (irisan buah kering) dibagian tengahnya.",
                                    "Kue ini diadaptasi dari kue khas negeri Belanda ‘kattetong’, tampilannya panjang dan tipis.",
                                    "kue keju atau kastengel telah menjadi salah satu kue kering ikon hari raya, baik hari raya Idul Fitri maupun Natal.",
                                    "Kue nastar sering muncul pada saat hari raya Lebaran maupun Natal dan resep kue nastar ini bagus untuk event tersebut.",
                                    "Kue kering bertekstur lembut ini biasanya menjadi primadona kue Lebaran, bahan utamanya dari tepung sagu,",
                                    "Dari bentuknya kue widaran keju mirip dengan kue telur gabus. Hanya saja kue gabus bercita rasa manis, sedangkan ini rasanya gurih asin.",
                                    "Perpaduan rasa gurih dari kacang mede dalam adonan kue dan manisnya gula halus di bagian luar membuat kue kering ini menjadi kegemaran semua orang.",
                                    "Penganan ini adalah cheese stick (stik keju) yang diberi cita rasa pedas sehingga lebih menggigit, berbeda dari cheese stick biasa.",
                                    "Tiap butirnya mengandung lebih rendah dari 50 kalori, dan cocok untuk teman bersantai Anda di waktu senggang"};

        String[] bahanResep = {"•\t250 gr tepung terigu protein sedang\n" +
                "•\t50 gr tepung tapioca\n" +
                "•\t2 butir telur\n" +
                "•\t75 ml santan kental\n" +
                "•\t50 gr tepung, untuk taburan\n" +
                "•\tMinyak untuk menggoreng\n" +
                "•\t4 siung bawang putih\n" +
                "•\t1 sdm garam\n" +
                "•\t2 butir bawang merah\n" +
                "•\t2 sdm daun seledri dicincang halus\n",

                "•\t350 gr tepung terigu protein sedang\n" +
                "•\t100 gr tepung maizena\n" +
                "•\t200 gr mentega\n" +
                "•\t200 gr gula bubuk\n" +
                "•\t4 kuning telur\n" +
                "•\t2 putih telur\n" +
                "•\t50 gram Sukade/buah kering untuk hiasan\n" +
                "•\t1 sdt vanila bubuk\n" +
                "•\t½ sdt garam\n" +
                "•\tMargarin untuk olesan\n",

                "•\t600 gram mentega\n" +
                "•\t350 gram gula halus\n" +
                "•\t1 sdt pasta vanili\n" +
                "•\t600 gram tepung terigu protein rendah\n" +
                "•\t50 gram susu bubuk fullcream\n" +
                "•\t2 sdm gula pasir\n" +
                "•\t4 butir telur, ambil putihnya saja\n" +
                "•\t2 kuning telur\n",

                "•\t250 gram mentega\n" +
                "•\t300 gram tepung terigu protein sedang\n" +
                "•\t1 butir telur\n" +
                "•\t100 gram keju edam parut\n" +
                "•\t100 gram keju cheddar parut\n" +
                "•\t3 kuning telur, untuk olesan\n" +
                "•\tMargarin secukupnya untuk olesan\n",

                "•\t400 g tepung terigu protein rendah\n" +
                "•\t100 g tepung maizena\n" +
                "•\t4 kuning telur\n" +
                "•\t1 putih telur\n" +
                "•\t1 sdt garam\n" +
                "•\t150 g gula bubuk\n" +
                "•\t250 g mentega\n" +
                "•\t1 sdt vanili bubuk\n" +
                "•\t2 kuning telur, untuk olesan\n" +
                "•\tMargarin secukupnya, untuk olesan\n" +
                "•\tCengkih, untuk hiasan\n",

            "•\t400 gr tepung sagu, sangrai hingga kekuningan\n" +
                "•\t200 gr gula bubuk\n" +
                "•\t2 butir telur\n" +
                "•\t½ sdt garam\n" +
                "•\t200 gr mentega\n" +
                "•\t100 gr keju cheddar parut\n" +
                "•\tMargarin untuk olesan\n",

            "•\t400 gr tepung ketan\n" +
                "•\t2 sdt garam\n" +
                "•\t100 gr keju cheddar parut\n" +
                "•\t4 kuning telur\n" +
                "•\t2 putih telur, kocok hingga kaku\n" +
                "•\t100 ml air\n" +
                "•\tMinyak untuk menggoreng\n",

            "•\t200 gr kacang mede, sangrai dan haluskan\n" +
                "•\t200 gr tepung terigu protein rendah\n" +
                "•\t100 gr gula mentega\n" +
                "•\t200 gr gula bubuk, untuk taburan\n" +
                "•\t1 sdt garam\n" +
                "•\tMargarin untuk olesan\n",

            "•\t500 gram terigu berprotein sedang\n" +
                "•\t200 gram tepung sagu\n" +
                "•\t100 gram cabai bubuk, atau sesuaikan dengan selera\n" +
                "•\t1 sendok makan maizena\n" +
                "•\t250 gram keju parmesan, parut\n" +
                "•\t100 gram mentega\n" +
                "•\t3 butir telur, kocok lepas\n" +
                "•\t1 sdt baking powder\n" +
                "•\t200 ml air es\n" +
                "•\t1 sdt garam\n" +
                "•\tMinyak secukupnya untuk menggoreng\n",

            "•\t125 gram tepung terigu serbaguna, ayak\n" +
                "•\t30 gram bubuk coklat\n" +
                "•\t½ sdt baking soda\n" +
                "•\t¼ sdt garam\n" +
                "•\t4 ons coklat hitam batang, cincang\n" +
                "•\t4 sdm mentega tawar\n" +
                "•\t110 gram brown sugar\n" +
                "•\t1 buah telur\n"};

        String[] pembuatanResep = {"1.\tCampur tepung terigu, tepung tapioka, bumbu halus, telur, dan santan. Aduk dan uleni hingga tercampur rata dan kalis.\n" +
                "2.\tMasukkan daun seledri cincang\n" +
                "3.\tSiapkan alat penggiling pasta, giling adonan 3 kali hingga menjadi lembaran setebal 2 mm.\n" +
                "4.\tBentangkan di atas talenan, lalu bentuk sesuai selera. Bisa juga dibuat menjadi seperti batang korek api dengan cetakan pasta. Taburi dengan tepung terigu agar tidak saling lengket.\n" +
                "5.\tPanaskan minyak wajan, goreng adonan hingga kuning kecoklatan. Angkat, tiriskan.\n" +
                "6.\tSetelah dingin, simpan dalam stoples kedap udara.\n",

                "1.\tKocok mentega dengan ½ bagian gula bubuk hingga mengembang. Masukkan kuning telur satu persatu sambil terus dikocok hingga tercampur rata.\n" +
                "2.\tMasukkan tepung terigu, garam, vanili bubuk dan tepung maizena, aduk perlahan dengan sendok kayu hingga rata.\n" +
                "3.\tKocok putih telur dengan sisa gula bubuk hingga mengembang dan kaku. Masukkan ke dalam adonan tepung sedikit demi sedikit hingga tercampur rata.\n" +
                "4.\tMasukkan adonan kedalam plastik segitiga yang telah diberi mata spuit bentuk bintang. Semprotkan adonan bentuk bunga di atas loyang datar yang telah diolesi margarin. Hias bagian atasnya dengan sukade.\n" +
                "5.\tPanggang dengan suhu 160°C selama 25 menit hingga matang dan kering. Angkat dan biarkan dingin. Simpan dalam stoples kedap udara.\n",

                "1.\tKocok mentega, gula halus, pasta vanili hingga putih pucat, tambahkan kuning telur, kocok kembali hingga adonan mengembang.\n" +
                "2.\tCampur tepung terigu dan susu, ayak sambil dimasukkan dalam adonan telur.\n" +
                "3.\tKocok putih telur pada wadah terpisah hingga mengembang, masukkan gula pasir, kocok terus hingga kaku.\n" +
                "4.\tSecara bertahap, masukkan adonan putih telur pada adonan kuning telur sambil diaduk rata menggunakan spatula.\n" +
                "5.\tTuang adonan yang sudah jadi kedalam plastik segitiga yg sudah dipasang spuit motif polos. Semprotkan adonan pada cetakan lidah kucing. Panggang dalam oven bersuhu 160C selama 20 menit\n",

                "1.\tKocok mentega dengan putih telur hingga putih dan mengembang \n" +
                "2.\tMasukkan keju edam parut sambil dikocok hingga rata\n" +
                "3.\tMasukkan tepung terigu, aduk perlahan dengan sendok kayu hingga tercampur rata.\n" +
                "4.\tGiling adonan dengan ketebalan ½ cm, potong-potong dengan lebar ½ cm panjang 2cm. Letakkan dan susun di dalam loyang datar yang telah diolesi margarin.\n" +
                "5.\tOlesi atasnya dengan kuning telur, taburi keju cheddar parut. Panggang dengan suhu 160C selama 25 menit hingga berwarna kuning kecokelatan dan kering. Angkat dan biarkan dingin. Simpan di dalam stoples kedap udara.\n",

                "1.\tSelai: campur semua bahan menjadi satu. Masak sambil diaduk-aduk hingga matang dan kalis. Angkat, biarkan dingin.\n" +
                "2.\tKocok gula bubuk dan mentega hingga putih dan mengembang\n" +
                "3.\tMasukkan telur satu persatu sambil dikocok hingga tercampur rata.\n" +
                "4.\tMasukkan tepung terigu, tepung maizena, vanili bubuk, dan garam, aduk perlahan dengan sendok kayu hingga rata.\n",

                "1.\tKocok mentega dan gula bubuk hingga putih dan mengembang. Masukkan telur, kocok hingga rata.\n" +
                "2.\tMasukkan keju parut, garam, dan tepung sagu. Aduk perlahan dengan spatula hingga tercampur rata.\n" +
                "3.\tMasukkan adonan ke dalam plastik segitiga yang telah diberi spuit. Semprotkan adonan bentuk bunga ke dalam loyang datar yang telah diolesi margarin.\n" +
                "4.\tPanggang dengan suhu 160C selama 25 menit hingga matang dan kering. Angkat, biarkan dingin.\n" +
                "5.\tSimpan dalam stoples kedap udara.\n",

                "1.\tCampur tepung ketan, garam, keju, air dan kuning telur, aduk rata.\n" +
                "2.\tMasukkan putih telur kocok, aduk perlahan dengan sendok kayu hingga tercampur rata dan kalis.\n" +
                "3.\tCetak adonan dengan tangan hingga berbentuk seperti cabe besar. Goreng dalam minyak\n" +
                "4.\tbanyak dengan api sedang. Lakukan sampai adonan habis. Goreng hingga kue berwarna keemasan. Angkat, tiriskan.\n" +
                "5.\tSetelah dingin simpan dalam stoples kedap udara.\n",

                "1.\tCampur tepung terigu, gula bubuk, kacang mede yang dihaluskan, mentega, dan garam menjadi satu. Aduk perlahan dengan spatula hingga tercampur rata.\n" +
                "2.\tBuat bulatan sebesar kelereng, letakkan di atas loyang datar yang telah diolesi margarin.\n" +
                "3.\tPanggang dengan suhu 160C selama 25 menit hingga matang dan kering. Angkat dan biarkan dingin.\n" +
                "4.\tLumuri dengan gula bubuk hingga rata. Simpan dalam stoples kedap udara.\n",

                "1.\tAduk semua bahan kering, tambahkan keju parut dan cabai bubuk.\n" +
                "2.\tMasukkan telur dan sebagian air. Uleni dengan tangan, tambahkan air sedikit demi sedikit hingga adonan menggumpal\n" +
                "3.\tTambahkan mentega, uleni adonan hingga kalis\n" +
                "4.\tGiling adonan dengan gilingan pasta. Potong sedikit adonan, gunakan mata gilingan yang rata. Giling hingga menjadi lembaran tipis. Kemudian gunakan mata gilingan untuk pemotong mie, masukkan lembaran adonan tipis ke dalamnya, giling\n" +
                "5.\tPotong-potong sesuai selera anda, letakkan di atas loyang yang ditaburi terigu.\n" +
                "6.\tGoreng Cheese Stick di minyak yang banyak, panaskan terlebih dahulu. Goreng dengan api sedang hingga matang kekuningan.\n",

                "1.\tCampur tepung terigu, bubuk coklat, baking soda dan garam dalam wadah, aduk rata.\n" +
                "2.\tLelehkan coklat batang, mentega dan brown sugar di dalam mangkok yang diletakkan di atas air mendidih. Matikan api, aduk-aduk hingga meleleh rata.\n" +
                "3.\tTambahkan telur pada adonan coklat. Kocok menggunakan mixer berkecepatan rendah, kocok hingga rata. Tambahkan terigu sedikit demi sedikit, aduk adonan hingga membentuk bola.\n" +
                "4.\tBagi adonan menjadi dua, gulung di atas kertas adonan hingga ketebalannya ¼ inci. Bekukan selama 20 menit.\n" +
                "5.\tPanaskan oven menjadi 180 derajat celcius. Ambil satu adonan, balikkan ke atas permukaan dan kupas kertas roti.\n" +
                "6.\tGunakan cetakan kue berbentuk hati, letakkan di atas loyang panggang.\n" +
                "7.\tPanggang hingga wangi dan mengeras, sekitar 10 menit, dinginkan.\n"};

        ArrayList<Resep> resepList = new ArrayList<>();

        for(int i = 0; i<judulResep.length; i++){
            Resep resep = new Resep(gambarResep[i], judulResep[i], deskripsiResep[i], bahanResep[i], pembuatanResep[i]);
            resepList.add(resep);
        }

        ResepAdapter resepAdapter = new ResepAdapter(this, resepList);
        recyclerView.setAdapter(resepAdapter);
    }
}
