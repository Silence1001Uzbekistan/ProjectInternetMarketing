package com.example.internetmarketing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.internetmarketing.databinding.ActivityHomeTwoBinding

class HomeTwoActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeTwoBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)


        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )



        binding.textOne.text = "Internet-marketing vujudga kelishi internet rivojlanishi bilan \n" +
                "chambarchas bog‘liq. Internet o‘z foydalanuvchilariga tarmoqda xarid \n" +
                "qilish, sotish va axborot almashish, reklama xabarlarini tarqatish va \n" +
                "ko‘pgina boshqa imkoniyatlarni berdi.\n" +
                "1990 yilgacha internetdan tijorat faoliyati uchun foydalanish AQSh \n" +
                "qonunchiligi tomonidan taqiqlangan edi. 1992 yilda internet ustidan \n" +
                "nazoratni xususiy qo‘llarga o‘tkazgandan keyingina undan biznes uchun \n" +
                "foydalanish mumkin bo‘ldi. Shu tariqa, 1992 yilda tadbirkor Charlz Stek \n" +
                "internetda kitob sotadigan dastlabki internet-magazinni ochdi [62, 75]. \n" +
                "1994 yilda First Virtual kompaniyasi tovarlarni internet-magazinda \n" +
                "sotib olganda to‘lov qiladigan birinchi to‘lov tizimiga aylandi. \n" +
                "1995 yilda Amazon kompaniyasi o‘zining internet-magazinini \n" +
                "ochdi." +
                "1996 yilda Master Card va Viza to‘lov tizimlari standart SET –\n" +
                "Internetda plastik kartalar yordamida hisob-kitob qilishning himoya \n" +
                "tizimini yaratdilar.\n" +
                "Birinchi internet-reklama, reklama banneri (1984-1994 yy.)\n" +
                "1994 yilda Hot Wired internet-nashri o‘z web-saytining bir qismini \n" +
                "reklama beruvchilarga u yerda reklama xabarlarini joylashtirish uchun \n" +
                "taqdim eta boshladi. Reklama joylarini ular “reklama bannerlari” deb \n" +
                "atashdi. Reklama joylarining ijarasi uchun Hot Wired nashriyoti \n" +
                "oldindan to‘lovni ola boshladi. Shunday qilib, misol uchun, AT&T \n" +
                "kompaniyasi Hot Wired nashriyoti saytida reklama bannerini uch oy \n" +
                "muddatga joylashtirish uchun \$30000 to‘ladi [69]. \n" +
                "Havolalar sotuvi (1998 – 2000 yy.)\n" +
                "1997 yilda amerikalik biznesmen Bill Gross foydalanuvchilar \n" +
                "izlagan talabnomalarga muvofiq saytlarning qidiruv natijalari bilan birga \n" +
                "ko‘rinadigan havolalarni sotish g‘oyasini ilgari suradi [62]. \n" +
                "1998 yilda u GoTo.com., keyinchalik Overture.com. deb qayta \n" +
                "nomlangan qidiruv tizimini yaratdi. Bu tizim foydalanuvchi \n" +
                "talabnomasiga javoban dastlab to‘g‘ri keladigan reklama havolalarini, \n" +
                "pastroq esa saytlarni tartiblash asosidagi qidiruv natijalarini chiqarib \n" +
                "berardi. Hozirda Overture.com. ko‘plab mashhur qidiruv tizimlari -\n" +
                "AltaVista, Lycos, MSN, Yahoo, Cnet va boshqalar bilan muvaffaqiyatli \n" +
                "hamkorlik qilmoqda.\n" +
                "2000 yilda Google kompaniyasi Google AdWords xizmati \n" +
                "(servisi)ni yaratdi. Google AdWords – bu Google Analytics kuchli \n" +
                "statistikasi bilan, kengaytirilgan hamkorlik tarmog‘i, hamda reklama \n" +
                "kampaniyalarining samaradorligini kuzatish uchun vositalarning turli \n" +
                "to‘plami bilan konstektual reklama tizimidir.\n" +
                "Saytga bo‘lgan havolalarning soni va sifati uning qidiruv tizimlaridagi \n" +
                "pozitsiyalariga ta'sir ko‘rsatadi. Bu loyihaning davomati va \n" +
                "mashhurligiga aks etadi. Saytning havolalarni qidirish tizimining \n" +
                "ro‘yxatidagi reytingi qanchalik yuqori bo‘lsa, uni qidiruv tizimlari \n" +
                "(Google, Yandex)da shunchalik ko‘p insonlar topadi." +
                "Internet-marketing paydo bo‘lgandan beri iqtisodchilar, olimlar, \n" +
                "amaliyotdagi marketologlar Internet-marketingga ko‘plab ta'riflar \n" +
                "berdilar. Ulardan bir nechtasini ko‘rib chiqamiz.\n" +
                "Internet-marketing – mahsulotni sotish yoki xaridorlarga xizmat \n" +
                "ko‘rsatish va ular bilan o‘zaro munosabatlarni boshqarish maqsadida \n" +
                "Internetda an'anaviy marketingning barcha jihatlaridan foydalanishdir \n" +
                "[62, 75].\n" +
                "Internet-marketing (veb-marketing) – internet tarmog‘idagi \n" +
                "marketing majmuasining barcha elementlariga dahldor bo‘lgan \n" +
                "marketing va tijorat faoliyatidir [62].\n" +
                "Onlayn yoki internet-marketing – kompaniya mijozlariga brend, \n" +
                "mahsulot yoki kompaniya xizmatlari haqidagi ma'lumotni tarqatish \n" +
                "uchun internet-kanallardan foydalanish amaliyotidir [90].\n" +
                "Internet-marketing – Internet tarmoq bozori singari muayyan \n" +
                "bozorni o‘rganish, zamonaviy Internet-texnologiyalar yordamida tovar \n" +
                "(xizmat) larni samarali reklama qilish va sotish bo‘yicha zarur chora\u0002tadbirlar majmuidir [81].\n" +
                "Internet-marketing – bu Internetning gipermedia muhitida \n" +
                "marketing tashkil etishning nazariyasi va metodologiyasidir, deb aytish \n" +
                "mumkin. Internet noyob tavsiflarga ega bo‘lib, ular marketingning \n" +
                "an'anaviy vositalari tavsifidan ancha farq qiladi. \n" +
                "Internet-marketingning an'anaviy marketingdan farq qiladigan ba'zi \n" +
                "asosiy tafovutlarda to‘xtalib o‘tamiz. \n" +
                "Birinchidan, marketing Internetda yuksak shaxsiylashtirish \n" +
                "darajasiga ega. An'anaviy marketing ommaviy iste'molchiga \n" +
                "yo‘naltirilgan bo‘lsa, Internetda har kimning (ma'lum miqdorda) fikri \n" +
                "hisobga olinadi va har bir kishi bilan o‘zaro ta'sir sodir bo‘ladi. \n" +
                "Boshqacha qilib aytganda, Internetdagi reklama alohida bir mijozni \n" +
                "qo‘lga kiritishga qaratilgan. Shuningdek, shaxsiy ma'lumot mavjudligi" +
                "reklama kampaniyalarida aniq tarketing (butun auditoriyadan berilgan \n" +
                "mezonlarni qoniqtiradigan qismini ajratish) o‘tkazishga imkon beradi.\n" +
                "Ikkinchidan, Internet-marketing interfaoldir: mijozlar ko‘pgina \n" +
                "biznes-jarayonlarga faol jalb etiladi. Bularga so‘rovnomalarda ishtirok \n" +
                "etish, firma obro‘sini shakllantirish, yangi mijozlarni jalb etish va shu \n" +
                "kabilarni kiritsa bo‘ladi. Bundan tashqari, mijozlar kompaniya yaratgan \n" +
                "internet-servis orqali buyurtmalarni shakllantirish, qo‘ng‘iroqlar \n" +
                "buyurtmasi, onlayn-maslahatchilarga murojaat qilish kabi muhim \n" +
                "vazifalarning bir qismini bajarishi mumkin. \n" +
                "Internet-marketing off–line da yo‘q bo‘lgan ulkan miqdordagi \n" +
                "axborotni ajratadi. Misol uchun, Internetda yuqori darajadagi aniqlik \n" +
                "bilan reklama samaradorligini, tashrif buyuruvchilar sonini, ularni \n" +
                "saytga keltirgan qiziqishni baholash, keng mulohaza olish, raqobat \n" +
                "razvedkasini muvaffaqiyatli o‘tkazish va hokazolar qilish mumkin. \n" +
                "Xususan, Internetda marketing tajribalari (masalan, yangi reklama \n" +
                "kampaniyasi yoki mahsulotlar aprobatsiyasi) offlaynega qaraganda \n" +
                "kamroq xarajat, mablag‘ va vaqt talab etadi. \n" +
                "Internet-marketing – bu Internetda an'anaviy marketingning barcha \n" +
                "jihatlaridan foydalanish amaliyoti bo‘lib, u marketingning barcha asosiy \n" +
                "elementlari – narx, mahsulot, sotish joyi va reklamaga dahldordir"
    }
}