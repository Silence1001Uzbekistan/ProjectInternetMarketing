package com.example.internetmarketing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.internetmarketing.databinding.ActivityHomeOneBinding

class HomeOneActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeOneBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)


        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )



        binding.textOne.text = "Marketingning vujudga kelishi bozor va bozor munosabatlari \n" +
                "shakllanishi bilan birga sodir bo‘ldi. Marketing faoliyatining eng taniqli \n" +
                "shakllari – reklama va narx belgilanishi – Qadimgi Misrdayoq \n" +
                "savdogarlar tomonidan qo‘llanilgan [42].\n" +
                "Ba'zi mutaxassislar ta'kidlashicha, savdo-sotiqda marketing \n" +
                "strategiyalaridan foydalanish holatlaridan biri Yaponiyada qo‘llanilgan \n" +
                "ekan. 1690 yilda Tokio shahrida Misui familiyali savdogar bir magazin \n" +
                "ochib, u yerda xaridorlar buyurtmalari asosida sifat kafolati va \n" +
                "assortimentning doimiy kengayishi bilan tovarlar sotardi [137]. \n" +
                "O‘zining hozirgi ko‘rinishiga marketing XVII asr oxiri – XVIII asr \n" +
                "boshlarida ega bo‘la boshladi. Ko‘plab mutaxassislar – iqtisodchi va \n" +
                "marketologlar fikriga muvofiq, marketing vatani deb Amerika Qo‘shma \n" +
                "Shtatlari hisoblanib, u yerga ba'zi marketing tushunchalari Buyuk \n" +
                "Britaniyadan keltirilgan. \n" +
                "Marketingning fan va biznes amaliyoti sifatidagi rivojlanishi XX \n" +
                "asrda boshlanadi.\n" +
                "1901 yilda AQSh da Sanoat Komissiyasining qishloq xo‘jaligi \n" +
                "mahsulotlarini sotish bo‘yicha hisoboti o‘qilib, unda birinchi bor \n" +
                "marketing yondashuviga ega bozorning tahlili taqdim etildi.\n" +
                "Shu yillardayoq marketing fan sifatida shakllana boshlaydi. \n" +
                "Illinoys, Michigan va Kaliforniya universitetlarida marketing bo‘yicha \n" +
                "kurslar o‘qitila boshlanadi. \n" +
                "1926 yilda AQSh da Marketing va reklama milliy assotsiasiyasi \n" +
                "tashkil etilib, uning asosida keyinchalik Amerika marketing jamiyati \n" +
                "tuziladi [62, 75].\n" +
                "XX asrning 30-yillari o‘rtasida marketing bo‘yicha dastlabki \n" +
                "jurnallar - «American Marketing Journal» va «National Marketing \n" +
                "Review» nashr etila boshlaydi.\n" +
                "1940-yillarda G‘arbiy Yevropa mamlakatlari va Yaponiyada \n" +
                "marketing assotsiasiyalari va tashkilotlari paydo bo‘la boshlaydi." +
                "“Marketing va jamoat fikrini o‘rganish Yevropa jamiyati”, Yevropa \n" +
                "marketing akademiyasi, Xalqaro marketing federatsiyasi (IMF) kabi \n" +
                "xalqaro tashkilotlar ham tashkil etildi.\n" +
                "Keyingi yillarda fan va amaliyot sifatidagi marketingning \n" +
                "rivojlanishi doimo takomillashdi – bozorni segmentlashtirish marketing \n" +
                "strategiyasi, “unikal tovar taklifi”, 4R konsepsiyasi, marketing \n" +
                "majmuining tizimliligi (marketing-mix), pozisionlashtirish konsepsiyasi\n" +
                "va boshqalar kabi marketing tushunchalari paydo bo‘ldi." +
                "Internet-marketing tushunchasini ko‘rib chiqishdan avval an'anaviy \n" +
                "marketingning asosiy tushunchalari va mohiyatini esga keltirish to‘g‘ri \n" +
                "bo‘lardi.\n" +
                "Hozirgi vaqtda an'anaviy marketing ta'riflari va mohiyati \n" +
                "keltirilgan ko‘p sonli manbalar mavjud. \n" +
                "Nufuzli manbalarda keltirilgan bir nechta marketing ta'riflarini \n" +
                "ko‘rib chiqamiz:\n" +
                "“Marketing – bu inson faoliyati turi bo‘lib, ayirboshlash orqali \n" +
                "zarurat va ehtiyojlarni qondirishga yo‘naltirilgan” [45, 50].\n" +
                "“Marketing – bu alohida shaxslar va tashkilotlar maqsadlarini \n" +
                "qoniqtiradigan ayirboshlash orqali fikrni rejalashtirish va amalga \n" +
                "oshirish, narx belgilash, g‘oya, tovar va xizmatlarni targ‘ib etish va \n" +
                "realizasiyasi jarayonidir”" +
                "“Marketing – bu ijtimoiy jarayon bo‘lib, xaridor uchun qiymatli \n" +
                "bo‘lgan tovar va xizmatlarni erkin raqobatli ayirboshlashni ta'minlash \n" +
                "orqali insonlar va tashkilotlar ehtiyojini va istaklarini qondirishga \n" +
                "yo‘naltirilgan”" +
                "“Marketing (ingl. marketing – “bozor faoliyati”) – tashkiliy \n" +
                "funksiya va xaridorlarga mahsulot yoki xizmatlarni yaratish, targ‘ib \n" +
                "qilish va taqdim etish jarayonlari majmui va ular bilan o‘zaro \n" +
                "munosabatlarni tashkilot uchun foyda bilan boshqarishdir. Qisqaroq \n" +
                "aytganda, marketing – bu foyda olish maqsadida bozor ehtiyojlarini \n" +
                "qondirishga yo‘naltirilgan faoliyatdir. Keng ma'noda marketing vazifasi \n" +
                "“inson va jamiyat ehtiyojlarini belgilash va qondirish” dan iborat”.\n" +
                "Marketingning maqsadli guruh o‘lchami bo‘yicha turlari\n" +
                "Ushbu mezonga ko‘ra, marketing quyidagi turlarga bo‘linadi [62]:\n" +
                "\uF0B7 Personal marketing;\n" +
                "\uF0B7 Ommaviy marketing;\n" +
                "\uF0B7 Tabaqalashtirilgan marketing;\n" +
                "\uF0B7 Maqsadli marketing.\n" +
                "Personal marketing – bu ishlab chiqaruvchi (yoki sotuvchi) ning \n" +
                "iste'molchi (yoki xaridor) bilan shaxsiy aloqasidir. Personal marketing \n" +
                "boshqa nomga ham ega – shaxs marketingi.\n" +
                "Personal marketing maqsadi – shaxs uchun personal brend \n" +
                "yaratishdir.\n" +
                "Personal brend – bu inson obro‘-e'tibori, uning boshqa kishilar \n" +
                "ongidagi obrazidir. Personal brendlar ko‘pincha taniqli shaxslar \n" +
                "(sportchilar, siyosatchilar, artistlar va hk.) uchun yaratiladi. Personal \n" +
                "brendlar ishlab chiqaruvchilar tomonidan o‘z tovarlarini targ‘ib etish \n" +
                "uchun qo‘llaniladi. \n" +
                "Misol uchun, futbolchi Leonel' Messining personal brendi keng \n" +
                "tarqalgan tovarlar (Coca-Cola ichimligi, Lays chipslari) ni targ‘ib etish \n" +
                "uchun keng qo‘llaniladi.\n" +
                "Ommaviy marketing. Ommaviy marketing bir turdagi tovarni \n" +
                "ommaviy ishlab chiqarish va uni bozorda iste'molchi uchun qulay \n" +
                "narxda sotishni tartibga solish bilan xarakterlanadi. Ommaviy \n" +
                "marketingning asosiy maqsadi – tovar sotishni maksimal ko‘paytirish.\n" +
                "Tabaqalashtirilgan marketing. Birinchi bor tabaqalashtirilgan \n" +
                "marketing tushunchasi XX asr 60-yillarida paydo bo‘ldi. U \n" +
                "marketingning eng muhim vositasi bo‘lmish bozorning bo‘linishi \n" +
                "(segmentasiya) tushunchasi bilan bog‘liq edi. Tabaqalashtirilgan" +
                "marketing strategiyasidan foydalanib, ishlab chiqaruvchi bozorning bir \n" +
                "nechta segmentiga e'tiborini qaratadi va har bir segment uchun \n" +
                "iste'molchi ehtiyojlarini qondiradigan mahsulot ishlab chiqaradi.\n" +
                "Maqsadli marketing. Maqsadli marketing – bu tovar yoki \n" +
                "xizmatlarni asosan berilgan bozor segmentida targ‘ib etish va sotish \n" +
                "bo‘yicha marketing tadbirlari majmuidir. Maqsadli marketingni amalga \n" +
                "oshirish uchun uch asosiy bosqichdan o‘tish kerak: bozorni \n" +
                "segmentlashtirish, bozorning maqsadli segmentini tanlash va o‘xshash \n" +
                "tovarlar bozorida yangi tovar joyini aniqlas"

    }
}