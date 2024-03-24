package id.ac.pnm.ti.utsmobilesatu

// data class Club
data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val ligachampion: Int,
    val ligaeropa: Int,
) {
    val totalTrophy: Int
        get() = epl + fa + efl + ligachampion + ligaeropa
}

// extension function recap
fun Club.recap(): String {
    return "$name berhasil meraih $epl trofi Liga Premier Inggris, $fa trofi FA, $efl trofi EFL, $ligachampion trofi Liga Champion, dan $ligaeropa trofi Liga Eropa UEFA"
}
