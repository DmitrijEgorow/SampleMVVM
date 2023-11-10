package ru.myitschool.lab23.di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module
import ru.myitschool.lab23.domain.RegisterUseCase
import ru.myitschool.lab23.domain.RegisterUseCaseImpl

val domainModule = module {

    factoryOf(::RegisterUseCaseImpl) bind RegisterUseCase::class

}