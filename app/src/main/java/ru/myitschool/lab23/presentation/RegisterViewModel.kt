package ru.myitschool.lab23.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.myitschool.lab23.domain.RegisterUseCaseImpl

class RegisterViewModel(
    private val registerUseCase: RegisterUseCaseImpl
) : ViewModel() {

    private val _registerState = MutableLiveData("LD")
    val registerState: LiveData<String>
        get() = _registerState


    init {
        _registerState.postValue(registerUseCase())
    }

}