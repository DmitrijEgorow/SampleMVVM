package ru.myitschool.lab23.domain

import kotlin.random.Random

class RegisterUseCaseImpl : RegisterUseCase {
    override fun invoke(): String {
        return "${Random.nextInt()}"
    }
}