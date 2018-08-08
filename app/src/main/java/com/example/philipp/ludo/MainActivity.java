package com.example.philipp.ludo;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


import java.io.IOException;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        








        final HashMap<Integer,Uri>  tracks = new HashMap<Integer,Uri>();



        tracks.put(0,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.deristscheisseundderistgoil));
        tracks.put(1,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.dieseleutenenntmanschwuchteln));
        tracks.put(2,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.duhastwixxeandernase));
        tracks.put(3,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.dummwietoastbrot));
        tracks.put(4,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.esheisstschwuchteln));
        tracks.put(5,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.freshdfreestyle));
        tracks.put(6,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.guckmalwieeeichichbin));
        tracks.put(7,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.halloichbinron));
        tracks.put(8,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.hastdumichgradefettgenannt));
        tracks.put(9,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.ichbinalt));
        tracks.put(10,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.ichbinimfalschenkurs));
        tracks.put(11,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.ichhabsieimradiogesehen));
        tracks.put(12,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.ichnehmeniemalsmadchen));
        tracks.put(13,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.nemessagezuvertellen));
        tracks.put(14,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.sexuellebelastigung));
        tracks.put(15,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.torstenundtorben));
        tracks.put(16,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.volldiedisser));
        tracks.put(17,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.wasistdas));
        tracks.put(18,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.wenndumeinegefuhleverletzenwolltest));
        tracks.put(19,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.wennichgradeihrenpenisgegessenhab));
        tracks.put(20,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.woodssuperdoopershop));
        tracks.put(21,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.wowichglaubichsehdoppelt));
        tracks.put(22,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.yoichbinfreshd));
        tracks.put(23,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.yolassunsmalfettwasfraasen));
        tracks.put(24,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.derweissjanichmalwas));
        tracks.put(25,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.bass));
        tracks.put(26,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.beliebigebeleidigung));
        tracks.put(27,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.bueroeingang));
        tracks.put(28,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.deinemudda));
        tracks.put(29,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.drago));
        tracks.put(30,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.dumm));
        tracks.put(31,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.fickdich));
        tracks.put(32,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.gegendiewand));
        tracks.put(33,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.genick));
        tracks.put(34,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.hailwurst));
        tracks.put(35,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.haustuer));
        tracks.put(36,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.hauswirtschaft));
        tracks.put(37,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.headandshoulders));
        tracks.put(38,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.ikea));
        tracks.put(39,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.inder));
        tracks.put(40,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.kakao));
        tracks.put(41,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.kinder));
        tracks.put(42,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.mathe));
        tracks.put(43,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.mongooma));
        tracks.put(44,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.nobel));
        tracks.put(45,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.nuesse));
        tracks.put(46,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.omakoma));
        tracks.put(47,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.parken));
        tracks.put(48,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.penilig));
        tracks.put(49,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.pikachuuu));
        tracks.put(50,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.pommes));
        tracks.put(51,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.post));
        tracks.put(52,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.retro));
        tracks.put(53,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.rosinen));
        tracks.put(54,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.schinken));
        tracks.put(55,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.sesam));
        tracks.put(56,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.statist));
        tracks.put(57,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.streber));
        tracks.put(58,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.toetemichnicht));
        tracks.put(59,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.torte));
        tracks.put(60,Uri.parse("android.resource://com.example.philipp.ludo/" + R.raw.unsub));

        final HashMap<Integer,Button> buttonMap = new HashMap<Integer,Button>();
        buttonMap.put(0, (Button) this.findViewById(R.id.ScheißeUndGoil));
        buttonMap.put(1, (Button) this.findViewById(R.id.Zauberstabsocke));
        buttonMap.put(2, (Button) this.findViewById(R.id.WichseAnDerNase));
        buttonMap.put(3, (Button) this.findViewById(R.id.DummwieToast));
        buttonMap.put(4, (Button) this.findViewById(R.id.Schwuchteeeln));
        buttonMap.put(5, (Button) this.findViewById(R.id.Freestyle));
        buttonMap.put(6, (Button) this.findViewById(R.id.WieReichIchBin));
        buttonMap.put(7, (Button) this.findViewById(R.id.HalloIchBinRon));
        buttonMap.put(8, (Button) this.findViewById(R.id.McGonnyWitz));
        buttonMap.put(9, (Button) this.findViewById(R.id.IchBinAlt));
        buttonMap.put(10, (Button) this.findViewById(R.id.FalscherKurs));
        buttonMap.put(11, (Button) this.findViewById(R.id.ImRadioGesehn));
        buttonMap.put(12, (Button) this.findViewById(R.id.NiemalsMädchen));
        buttonMap.put(13, (Button) this.findViewById(R.id.MessageVertellen));
        buttonMap.put(14, (Button) this.findViewById(R.id.SexuelleBelästigung));
        buttonMap.put(15, (Button) this.findViewById(R.id.Torsten));
        buttonMap.put(16, (Button) this.findViewById(R.id.VollDieDisser));
        buttonMap.put(17, (Button) this.findViewById(R.id.Unsichtbar));
        buttonMap.put(18, (Button) this.findViewById(R.id.VerletzteGefühle));
        buttonMap.put(19, (Button) this.findViewById(R.id.PenisGegessen));
        buttonMap.put(20, (Button) this.findViewById(R.id.WoodsSuperDooper));
        buttonMap.put(21, (Button) this.findViewById(R.id.IchSehDoppelt));
        buttonMap.put(22, (Button) this.findViewById(R.id.YoIchBinFreshD));
        buttonMap.put(23, (Button) this.findViewById(R.id.FettWasFrääsen));
        buttonMap.put(24, (Button) this.findViewById(R.id.Isoprophenpophenyl));
        buttonMap.put(25, (Button) this.findViewById(R.id.Basslastig));
        buttonMap.put(26, (Button) this.findViewById(R.id.Beliebigebeleidigung));
        buttonMap.put(27, (Button) this.findViewById(R.id.Bueroeingang));
        buttonMap.put(28, (Button) this.findViewById(R.id.DeineMudda));
        buttonMap.put(29, (Button) this.findViewById(R.id.Drago));
        buttonMap.put(30, (Button) this.findViewById(R.id.Dumm));
        buttonMap.put(31, (Button) this.findViewById(R.id.FickDich));
        buttonMap.put(32, (Button) this.findViewById(R.id.Gegendiewand));
        buttonMap.put(33, (Button) this.findViewById(R.id.Genick));
        buttonMap.put(34, (Button) this.findViewById(R.id.Hailwurst));
        buttonMap.put(35, (Button) this.findViewById(R.id.Haustuer));
        buttonMap.put(36, (Button) this.findViewById(R.id.Hauswirtschaft));
        buttonMap.put(37, (Button) this.findViewById(R.id.Headandshoulders));
        buttonMap.put(38, (Button) this.findViewById(R.id.Ikea));
        buttonMap.put(39, (Button) this.findViewById(R.id.Inder));
        buttonMap.put(40, (Button) this.findViewById(R.id.Kakao));
        buttonMap.put(41, (Button) this.findViewById(R.id.Kinder));
        buttonMap.put(42, (Button) this.findViewById(R.id.Mathe));
        buttonMap.put(43, (Button) this.findViewById(R.id.Mongooma));
        buttonMap.put(44, (Button) this.findViewById(R.id.Nobel));
        buttonMap.put(45, (Button) this.findViewById(R.id.Nüsse));
        buttonMap.put(46, (Button) this.findViewById(R.id.Omakoma));
        buttonMap.put(47, (Button) this.findViewById(R.id.Parken));
        buttonMap.put(48, (Button) this.findViewById(R.id.Peinlig));
        buttonMap.put(49, (Button) this.findViewById(R.id.Pikachu));
        buttonMap.put(50, (Button) this.findViewById(R.id.Pommes));
        buttonMap.put(51, (Button) this.findViewById(R.id.Post));
        buttonMap.put(52, (Button) this.findViewById(R.id.Retro));
        buttonMap.put(53, (Button) this.findViewById(R.id.Rosinen));
        buttonMap.put(54, (Button) this.findViewById(R.id.Schinken));
        buttonMap.put(55, (Button) this.findViewById(R.id.Sesam));
        buttonMap.put(56, (Button) this.findViewById(R.id.Statist));
        buttonMap.put(57, (Button) this.findViewById(R.id.Streber));
        buttonMap.put(58, (Button) this.findViewById(R.id.Toetemichnicht));
        buttonMap.put(59, (Button) this.findViewById(R.id.Torte));;
        buttonMap.put(60, (Button) this.findViewById(R.id.Unsubscribe));

        mp = MediaPlayer.create(getApplicationContext(),tracks.get(0));

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {



    //Uri testuri = Uri.parse("android.resource://" + "com.example.philipp.ludo" + "/" + R.raw.kinder);

                for (int i = 0; i<buttonMap.size();i++) {
                    if (buttonMap.get(i).equals(v)) {

                       // mp = MediaPlayer.create(getApplicationContext(),tracks.get(i));
                        mp.reset();
                       try {
                            mp.setDataSource(getApplicationContext(),tracks.get(i));
                            mp.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp.stop();
                            }
                        });
                        mp.start();
                    }
                }


                }



        };

        for (int i = 0 ; i<buttonMap.size();i++) {
            buttonMap.get(i).setOnClickListener(listener);
        }


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.philipp.ludo/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.philipp.ludo/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
