package ru.myitschool.lab23.di


import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.myitschool.lab23.presentation.RegisterViewModel

val presentationModule = module {

    viewModel {
        RegisterViewModel(get())
    }

}