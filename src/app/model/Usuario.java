package app.model;

public class Usuario {
        private int id;
        int age;
        String name;
        String email;

        public Usuario (int id, int age, String name, String email) {
                this.id = id;
                this.age = age;
                this.name = name;
                this.email = email;
        }

        public int getAge() {
                return age;
        }

        public String getEmail() {
                return email;
        }

        public int getId() {
                return id;
        }

        public String getName() {
                return name;
        }
}