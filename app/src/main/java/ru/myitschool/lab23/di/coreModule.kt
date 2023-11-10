package ru.myitschool.lab23.di

import org.koin.dsl.module

val coreModule = module {
    includes(presentationModule, domainModule)
}
