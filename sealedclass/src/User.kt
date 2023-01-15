

sealed class User {

    data class Email(val id: String, val email: String, val password: String?) : User()
        data class Facebook(val id: String) : User()
        data class Google(val id: String) : User()
    }

    fun getUserType(user: User): String {
        return when (user) {
            is User.Email -> "Email: ${user.email}, ID: ${user.id}"
            is User.Facebook -> "Facebook, ID: ${user.id}"
            is User.Google -> "Google, ID: ${user.id}"
        }
    }
