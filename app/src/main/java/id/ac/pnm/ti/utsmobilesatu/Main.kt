package id.ac.pnm.ti.utsmobilesatu

fun main() {
    // Inisialisasi mutableList dan tambah data List
    val clubs = mutableListOf<Club>()
    clubs.add(Club("Liverpool",19,8,9,6,3))
    clubs.add(Club("Manchester United",20,12,6,3,1))
    clubs.add(Club("Chelsea",6,6,5,2,2))
    clubs.add(Club("Manchester City",8,8,8,0,0))
    clubs.add(Club("Arsenal",13,14,2,0,0))

    // Passing a named function ::sortByNumberTrophyTotal
    val sortedClubs = sortByNumberTrophyTotal(clubs)
    // Hasil sorting total trofi
    println("Urutan klub berdasarkan jumlah total trofi: ")
    for (club in sortedClubs) {
        println("> ${club.name} dengan jumlah trophy : ${club.totalTrophy}")
    }

    // Passing a named function ::filterByEuropeanTrophy
    val filteredClubs = filterByEuropeanTrophy(clubs)
    // Hasil sorting total trofi
    println("Klub yang belum pernah memenangkan UCL dan UEL:")
    for (club in clubs) {
        if (club.ligachampion == 0 && club.ligaeropa == 0)
            println(">${club.name}")
    }

    // Panggil extension function Club recap
    println("Informasi tentang perolehan trophy setiap club :")
    for (club in clubs)
        println("> ${club.recap()}")
}

// High order function filter and sort
fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return options(clubs)
}

// Fungsi sorting
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    val sortedClubs = clubs.sortedByDescending {
        it.totalTrophy
    }
    return sortedClubs

}

// Fungsi filter
fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
    val filteredClubs = clubs.filter {
        it.ligaeropa > 0
    }
    return filteredClubs
}