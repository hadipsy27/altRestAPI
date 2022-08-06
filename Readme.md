## Perbedaan JpaRepository dengan CrudRepository


| CrudRepository                                                           | JpaRepository |
|--------------------------------------------------------------------------|---------------|
| Jpa Repository berbasis interface yang meng extends Repositroy Interface | Turunan dari PagingAndSortingRepository yang merupakan turunan dari CrudRepository|
| Tidak dapat mengimplementasikan method paging & sorting                  | dapat mengimplementasikan pagination dan sorting |
| Berisi operasi CRUD misal save(), saveAll(), findById(), findAll(), dll. | berisi lengkap dari CrudRepository dan PangingAndSortingRepository