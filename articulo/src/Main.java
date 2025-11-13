
        public class Main {
            public static void main(String[] args) {
                // Articulo genérico
                Articulos a = new Articulos("Artículo genérico", 2020, 1.5);
                System.out.println(a);
                System.out.println("Precio 3 artículos por 5 días: " + a.calcularPrecio(3, 5) + " €");

                // Libro
                Libro libro = new Libro("El misterio", 2018, "Ana Pérez", 2.5, Genero.MISTERIO);
                libro.setNumPaginas(250);
                System.out.println(libro);
                System.out.println("Es largo? " + libro.esLargo());

                // Pelicula
                Pelicula peli = new Pelicula("La gran aventura", 2021, 3.0, "Carlos Ruiz", 125);
                System.out.println(peli);
                System.out.print("Duración: ");
                peli.getDuracionHorasYMinutos();
                System.out.println("Duración en segundos: " + peli.getDuracionSegundos());

                // AlbumMusica
                AlbumMusica album = new AlbumMusica("Hits 2020", 2020, 1.2, "Various", 12, false);
                System.out.println(album);
                System.out.println("Duración total (suponiendo 4 min por canción): " + album.getDuracionTotal(4) + " minutos");

                // Videojuego
                Videojuego juego = new Videojuego("Space Battle", 2019, 2.0, "DevStudio", "PC,PS5", 16);
                System.out.println(juego);
                System.out.println("Para adultos? " + juego.paraAdultos());
                System.out.println("¿Apto para 15 años? " + juego.esApto(15));
                System.out.println("¿Apto para 16 años? " + juego.esApto(16));
            }
        }


