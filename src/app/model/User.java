package app.model;

public class User {
        private int id;
        int age;
        String name;
        String email;

        public User (int id, int age, String name, String email) {
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

        public void setAge(int age) {
                this.age = age;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public void setId(int id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }
}