package com.example.apay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton llIvImg = findViewById(R.id.llIvImg);
        ImageButton llIvImg2 = findViewById(R.id.llIvImg2);
        ImageButton llIvImg3 = findViewById(R.id.llIvImg3);
        ImageButton llIvImg4 = findViewById(R.id.llIvImg4);
        ImageButton llIvImg5 = findViewById(R.id.llIvImg5);
        ImageButton llIvImg6 = findViewById(R.id.llIvImg6);
        ImageButton llIvImg7 = findViewById(R.id.llIvImg7);
        ImageButton llIvImg8 = findViewById(R.id.llIvImg8);
        ImageButton llIvImg9 = findViewById(R.id.llIvImg9);
        ImageButton llIvImg10 = findViewById(R.id.llIvImg10);
        ImageButton llIvImg11 = findViewById(R.id.llIvImg11);
        ImageButton llIvImg12 = findViewById(R.id.llIvImg12);
        ImageButton llIvImg13 = findViewById(R.id.llIvImg13);
        ImageButton llIvImg14 = findViewById(R.id.llIvImg14);
        ImageButton llIvImg15 = findViewById(R.id.llIvImg15);
        ImageButton llIvImg16 = findViewById(R.id.llIvImg16);
        ImageButton llIvImg17 = findViewById(R.id.llIvImg17);
        ImageButton llIvImg18 = findViewById(R.id.llIvImg18);
        ImageButton llIvImg19 = findViewById(R.id.llIvImg19);
        ImageButton llIvImg20 = findViewById(R.id.llIvImg20);
        ImageButton llIvImg21 = findViewById(R.id.llIvImg21);
        ImageButton llIvImg22 = findViewById(R.id.llIvImg22);
        ImageButton llIvImg23 = findViewById(R.id.llIvImg23);
        ImageButton llIvImg24 = findViewById(R.id.llIvImg24);
        ImageButton llIvImg25 = findViewById(R.id.llIvImg25);
        ImageButton llIvImg26 = findViewById(R.id.llIvImg26);
        ImageButton llIvImg27 = findViewById(R.id.llIvImg26);
        ImageButton llIvAccounts = findViewById(R.id.llIvAccounts);
        TextView llTvProducts = findViewById(R.id.llTvProducts);



        llIvAccounts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, MainLogoutActivity.class);
                startActivity(intent);

            }
        });


        llIvImg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.mstock.com/refer-and-earn"));
                startActivity(i);
            }
        });
        llIvImg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.makemytrip.com/gift-cards/?cmp=SEM|D|GC|G|Generic|GC_Generic|High-Intent|RSA|Regular|701692751502&s_kwcid=AL!1631!3!701692751502!b!!g!!gift%20card&gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V-X-qrMIzbLjsznVrIvz6ptFMFyzXJPBnOIbmIyYmYGM4NtKxh3_qkaAoFuEALw_wcB"));
                startActivity(i);
            }
        });
        llIvImg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://cashkaro.com/"));
                startActivity(i);
            }
        });

        llIvImg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store/search?q=ludo+king&c=apps&hl=en_IN"));
                startActivity(i);
            }
        });

        llIvImg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store/search?q=winzo&c=apps&hl=en_IN"));
                startActivity(i);
            }
        });

        llIvImg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store/search?q=a23+rummy&c=apps"));
                startActivity(i);
            }
        });

        llIvImg10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.airtel.in/"));
                startActivity(i);
            }
        });


        llIvImg11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root"));
                startActivity(i);
            }
        });

        llIvImg12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.amazon.in/?gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V-SqpOQ-e00Wht0BGhxEk0Z7_qpixYSY5UJKBioIPe29JVtrVNHGGkaAo6GEALw_wcB"));
                startActivity(i);
            }
        });

        llIvImg13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.flipkart.com/black-friday-sale-store?param=72922&s_kwcid=AL!739!3!676201929245!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V_0a7CWAEn2ihJFOUADnr5V9GY6OVXx3hrnIZftyghQlZMPyWDWggkaAkksEALw_wcB"));
                startActivity(i);
            }
        });

        llIvImg14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://pizzaonline.dominos.co.in/postorder-ui/login?&src=affiliate_prudigital_1672_&utm_source=affiliate&utm_medium=prudigital&utm_campaign=1672_&gad_source=1"));
                startActivity(i);
            }
        });
        llIvImg15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.tataaig.com/buy-online/motor-insurance/car-insurance?utm_source=google&utm_medium=cpc&utm_campaign={4W_Generic_TopPerforming_Rest_India_BPE}-car%20insurance-20410039401-160439953188-kwd-10125091&utm_content=667693415500&gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V8M1Cp01G9TE_3tnt78Eck-ozgZVxrMK-90vChHrQ_WDYkFSaftF5UaAgJOEALw_wcB"));
                startActivity(i);
            }
        });
        llIvImg16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.tataaig.com/motor-insurance/two-wheeler-insurance?utm_source=Display&utm_medium=PerformanceMax&utm_campaign={LS_TW_Pmax_Mar24}--21073063425--&utm_content=&gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V8sItHHbQbVtFTeHJOBjobFxUsF3O9H9cZh-w6lxqLO3XsCR1momGwaAvy9EALw_wcB"));
                startActivity(i);
            }
        });
        llIvImg17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://health.policybazaar.com/?offerid=1&r=true&pb_source=google&pb_medium=cpc&pb_term=Health+insurance&pb_campaign=Core_Desktop00Health_Insurance_networkg&loc_interest_ms=&loc_physical_ms=9301335&gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V_9uTPx180VjNiJv8A0Y2L7WHLCOoaTrD-YyC3KkVlvHCB_2vD96qMaAsgaEALw_wcB"));
                startActivity(i);
            }
        });
        llIvImg18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.bajajfinserv.in/business-loan?utm_source=google_mktg&utm_medium=cpc&utm_campaign=dppm_bl_ob_pt_google_bol_pmax_lead_gst_offer_cap_in_all_nov24&gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V_FThMo2SFbN_bhTPID87dV7OA1MokF5geVUNhLphWnPf774TOQj_4aAouzEALw_wcB"));
                startActivity(i);
            }
        });

        llIvImg19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.bajajfinservmarkets.in/apply-for-personal-loan-finservmarkets/?utm_source=Organic_Markets&utm_medium=SOL_Remarketing&utm_campaign=Google_Pmax_WebLead_Loan&utm_content=UNSEC_Remarketing&gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V-91MdLaCapRMoUZcErMtDmVfFqL8Piq0qBSzPZAp7P9oYmlaS8OU8aAh0TEALw_wcB"));
                startActivity(i);
            }
        });

        llIvImg20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.muthootfinance.com/services/Gold-Loan-Is-Good/?utm_source=google_search&utm_medium=cpc&utm_campaign=gold-loan_inia_sech_geic_mint_north&utm_campaignid=20845823995&utm_adgroupid=162617323848&utm_keyword=gold%20loan&utm_placement=&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V8xV_KhMPEcRfMzoDYyEIco2QOI94rgAb6NjBWMRWeIHBwxcABXs-waAm0JEALw_wcB"));
                startActivity(i);
            }
        });

        llIvImg21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.sbicard.com/sprint/simplyClick?CS=Google"));
                startActivity(i);
            }
        });
        llIvImg22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.makemytrip.com/flights/?gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V9rZL9BUO9TCGfDE8IayCr7s1Nohn_0eMpRh3vYggBE_h3L61DOhBcaApLTEALw_wcB&cmp=SEM|D|DF|G|Generic|Generic-Generic_DT|DF_Generic_Exact|RSA|Offer3|673438880783&s_kwcid=AL!1631!3!673438880783!e!!g!!flight%20ticket&ef_id=Cj0KCQiAgJa6BhCOARIsAMiL7V9rZL9BUO9TCGfDE8IayCr7s1Nohn_0eMpRh3vYggBE_h3L61DOhBcaApLTEALw_wcB:G:s&gad_source=1"));
                startActivity(i);
            }
        });
        llIvImg23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.redbus.in/?gad_source=1&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V-6z8ADng6GeiRrCg9nURtm8Qy840eeImHSiMj4E4jVzd-_f90u09UaAq6lEALw_wcB"));
                startActivity(i);
            }
        });
        llIvImg24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.irctc.co.in/nget/train-search"));
                startActivity(i);
            }
        });
        llIvImg25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://in.bookmyshow.com/explore/movies?gad_source=1&%243p=a_google_adwords&%24always_deeplink=false&~ad_set_id&~campaign_id=21161160610&~channel=Pmax&~keyword&~placement&~campaign=IA_Movies_BAU_Google_Pmax_Hindi_Roar_Apr24&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V_Q87gdTNvGGtfpK4UIVyoivW4SXzGo0dIWBVB0Bp2KiHsxeJGLlQ4aAte6EALw_wcB&_branch_match_id=1296187211860150569"));
                startActivity(i);
            }
        });
        llIvImg26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://in.bookmyshow.com/explore/online-streaming-events?gad_source=1&%243p=a_google_adwords&%24always_deeplink=false&~ad_set_id&~campaign_id=21161160610&~channel=Pmax&~keyword&~placement&~campaign=IA_Movies_BAU_Google_Pmax_Hindi_Roar_Apr24&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V8kdqc5zdHLFHSk7WbfOq6JDpV38neiIbUOM_CQeb878qcQmb2bH0kaAsFhEALw_wcB&_branch_match_id=1296187211860150569"));
                startActivity(i);
            }
        });
        llIvImg27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://in.bookmyshow.com/explore/online-streaming-events?gad_source=1&%243p=a_google_adwords&%24always_deeplink=false&~ad_set_id&~campaign_id=21161160610&~channel=Pmax&~keyword&~placement&~campaign=IA_Movies_BAU_Google_Pmax_Hindi_Roar_Apr24&gclid=Cj0KCQiAgJa6BhCOARIsAMiL7V8kdqc5zdHLFHSk7WbfOq6JDpV38neiIbUOM_CQeb878qcQmb2bH0kaAsFhEALw_wcB&_branch_match_id=1296187211860150569"));
                startActivity(i);
            }
        });

        llIvImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, MainActivityHistory.class);
                startActivity(intent);

            }
        });

        llIvImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);

            }
        });

        llTvProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);

            }
        });

        llIvImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scanCode();
            }
        });
    }

    private void scanCode() {
        ScanOptions options = new ScanOptions();
        options.setPrompt("Volume up to flash on");
        options.setBeepEnabled(true);
        options.setOrientationLocked(false);
        barLauncher.launch(options);
    }

    ActivityResultLauncher<ScanOptions> barLauncher = registerForActivityResult(new ScanContract(), result->{
        if (result.getContents() !=null)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity3.this);
            builder.setTitle("Result");
            builder.setMessage(result.getContents());
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).show();
        }
    });
}