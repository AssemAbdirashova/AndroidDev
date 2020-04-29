package com.example.recycle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NewsListAdapter adapter;
    private RecyclerView srecyclerView;
    private NewsListAdapter sadapter;
    private NewsListAdapter.ItemClickListener listener = null;

    private final String KEY_RECYCLER_STATE = "recycler_state";
    private RecyclerView mRecyclerView;
    private RecyclerView secRecyclerView;
    private static Bundle mBundleRecyclerViewState;


    protected void onPause()
    {
        super.onPause();

        // save RecyclerView state
        mBundleRecyclerViewState = new Bundle();
        Parcelable listState = mRecyclerView.getLayoutManager().onSaveInstanceState();
        mBundleRecyclerViewState.putParcelable(KEY_RECYCLER_STATE, listState);
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        // restore RecyclerView state
        if (mBundleRecyclerViewState != null) {
            Parcelable listState = mBundleRecyclerViewState.getParcelable(KEY_RECYCLER_STATE);
            mRecyclerView.getLayoutManager().onRestoreInstanceState(listState);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.mainNews);//set to whatever view id you use
        secRecyclerView = (RecyclerView) findViewById(R.id.history);


        listener = new NewsListAdapter.ItemClickListener() {
            @Override
            public void itemClick(int position, News item) {
                Intent intent = new Intent(MainActivity.this, NewsDetailActivity.class);
               intent.putExtra("news", (Parcelable) item);
                intent.putExtra("index", position);
                startActivity(intent);
//                ActionBar actionBar = getSupportActionBar(); // or getActionBar();
//                getSupportActionBar().setTitle("My new title"); // set the top title

            }
        };

        recyclerView = findViewById(R.id.mainNews);
        srecyclerView = findViewById(R.id.history);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        srecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NewsListAdapter(newsGenerator(), listener, this , "first");
        sadapter = new NewsListAdapter(newsGenerator(), listener, this, "second");
        recyclerView.setAdapter(adapter);
        srecyclerView.setAdapter(sadapter);


    }


    private List<News> newsGenerator(){
        int resId = getResources().getIdentifier(
                "kkk",
                "drawable",
                getPackageName()
        );
        int resId4 = getResources().getIdentifier(
                "rrr",
                "drawable",
                getPackageName()
        );
        int resfmem = getResources().getIdentifier(
                "emmem",
                "drawable",
                getPackageName()
        );
        int resfnet = getResources().getIdentifier(
                "netflix",
                "drawable",
                getPackageName()
        );
        int resfparty = getResources().getIdentifier(
                "party",
                "drawable",
                getPackageName()
        );
        int resfyoung = getResources().getIdentifier(
                "young",
                "drawable",
                getPackageName()
        );
        int resfphobia = getResources().getIdentifier(
                "phobia",
                "drawable",
                getPackageName()
        );
        int resfstory = getResources().getIdentifier(
                "story",
                "drawable",
                getPackageName()
        );
        int resfknow = getResources().getIdentifier(
                "know",
                "drawable",
                getPackageName()
        );
        int resfhappiness = getResources().getIdentifier(
                "happiness",
                "drawable",
                getPackageName()
        );
        int resfpain = getResources().getIdentifier(
                "pain",
                "drawable",
                getPackageName()
        );
        int resfbook = getResources().getIdentifier(
                "book",
                "drawable",
                getPackageName()
        );
        int resbookimg = getResources().getIdentifier(
                "bookimg",
                "drawable",
                getPackageName()
        );
        int resphobiaimg = getResources().getIdentifier(
                "phobiaimg",
                "drawable",
                getPackageName()
        );
        int resknowimg = getResources().getIdentifier(
                "knowimg",
                "drawable",
                getPackageName()
        );
        int resnetfliximg = getResources().getIdentifier(
                "netfliximg",
                "drawable",
                getPackageName()
        );
        int resfemaleimg = getResources().getIdentifier(
                "femaleimg",
                "drawable",
                getPackageName()
        );
        int respartyimg = getResources().getIdentifier(
                "partyimg",
                "drawable",
                getPackageName()
        );
        int resstoryimg = getResources().getIdentifier(
                "storyimg",
                "drawable",
                getPackageName()
        );
        int resyoungimg = getResources().getIdentifier(
                "youngimg",
                "drawable",
                getPackageName()
        );
        int reshappinessimg = getResources().getIdentifier(
                "h",
                "drawable",
                getPackageName()
        );
        int respainimg = getResources().getIdentifier(
                "painimg",
                "drawable",
                getPackageName()
        );
        String iii = "jkahdflfnxcnvhjaslhfsafj;asjfd;aksjfj;a;aasdfja;kfjfff;askjdfa;;sfjdjf";
        String detail = "There are more information about thiss aa;Банк данных заработных плат\n" +
                "С ноября 2013 года HeadHunter запустил уникальный проект федерального масштаба под названием «Банк данных заработных плат» — профессиональный обзор заработных плат, созданный полностью в онлайне.\n" +
                "\n" +
                "Данные по зарплатам берутся не из резюме и не из вакансий. Как и в любом профессиональном обзоре заработных плат лучших провайдеров данные об уровне заработных плат предоставляют компании-клиенты.\n" +
                "\n" +
                "Доступ к отчёту появляется после заполнения анкеты о заработных платах и льготах в компании. В отчёте информация предоставляется в виде статистически упорядоченной выборки (без индивидуальной информации по конкретной компании).\n" +
                "\n" +
                "Данные о компенсациях и льготах всегда поддерживаются в актуальном состоянии.\n" +
                "\n" +
                "hh.индекс\n" +
                "hh.индекс — показатель, введенный Службой исследований HeadHunter. Вычисляется путём соотношения количества размещенных в базе hh.ru резюме к количеству открытых вакансий. Чем больше индекс, тем больше разрыв между количеством резюме и вакансий. Если индекс равен одному, значит, количество вакансий равно количеству резюме. Значение hh.индекса обновляется ежедневно.kdsfhxbc,zvnbsadjfa;a;jkldsfja;sljkdfa;;skljdf;asklfjd;a;ssklajdfjf;hgbvzxurioeqtuoerg;askjdf;asjkdf;asdfjkffa;sfdjkfjja;sadfjd;aa;dljkfdff;asdjkf";
        List<News> items = new ArrayList<>();

        News first = new News("FEMALE MEMES" ,
                "час назад",
                "Когда нашла ",
                "27" ,
                "5 857",
                "78K" ,
                "14",
                resfmem,
                resfemaleimg,
                detail);
        items.add(first);
        News second = new News("NETFLIX" ,
                "20 фев 20:37" ,
                "Первый постер сериала «Голливуд», который подробно расскажет о Золотой эпохе Голливуда.\n" +
                        "\n" +
                        "Создателем проекта числится Райан Мёрфи\n" +
                        "\n" +
                        "Премьера: 1 мая",
                "47" ,
                "4 248",
                "118К" ,
                "17",
                resfnet,
                resnetfliximg,
                detail);
        items.add(second);
        News third = new News("это моя вечеринка" ,
                "два часа назад" ,
                "— Дай списать домашку?\n" +
                        "— Только не точь в точь!\n" +
                        "— Ок.\n",
                "24" ,
                "8 747",
                "157К" ,
                "82",
                resfparty,
                respartyimg,
                detail);
        items.add(third);
        News forth = new News("твоей прекрасной юности момент" ,
                "18 февраля 14:45" ,
                "(((((",
                "46" ,
                "4 486",
                "47К" ,
                "12",
                resfyoung,
                resyoungimg,
                detail);
        items.add(forth);
        News fifth = new News("P H O B I A" ,
                "вчера в 23:17" ,
                "Как жаль, что это не обо мне(",
                "4" ,
                "316",
                "12К" ,
                "2",
                resfphobia,
                resphobiaimg,
                detail);
        items.add(fifth);
        News sixth = new News("My Story" ,
                "сегодня в 12:34" ,
                "Сорвалась. Очень сильно сорвалась.",
                "" ,
                "234",
                "19К" ,
                "55",
                resfstory,
                resstoryimg,
                detail);
        items.add(sixth);
        News seventh = new News("А ты знал?" ,
                "10 авг 2017" ,
                "ХЕХ",
                "30 277" ,
                "494 799",
                "16.4М" ,
                "",
                resfknow,
                resknowimg,
                detail);
        items.add(seventh);
        News eighth = new News("The Pursuit of HappYness" ,
                "вчера  22:35" ,
                "Вот так мы встречаем в жизни своих лучших друзей\uD83D\uDE05",
                "45" ,
                "249",
                "5К" ,
                "17",
                resfhappiness,
                reshappinessimg,
                detail);
        items.add(eighth);
        News nineth = new News("P A I N" ,
                "сегодня в 21:34" ,
                "оставайся",
                "6" ,
                "97",
                "4K" ,
                "",
                resfpain,
                respainimg,
                detail);
        items.add(nineth);
        News tenth = new News("Книгомания" ,
                "вчера в 21:57 " ,
                "Чувства людей гораздо интереснее их мыслей.\n" +
                        "\n" +
                        "— Оскар Уайльд",
                "17" ,
                "140",
                "3.5K" ,
                "",
                resfbook,
                resbookimg,
                detail);
        items.add(tenth);
//        for(int i=0; i < 10; i++){
//            items.get(i).g
//        }
        return items;
    }


}
