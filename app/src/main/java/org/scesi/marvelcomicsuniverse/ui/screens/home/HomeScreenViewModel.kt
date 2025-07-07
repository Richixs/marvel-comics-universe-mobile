package org.scesi.marvelcomicsuniverse.ui.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.scesi.marvelcomicsuniverse.data.MarvelRepository
import org.scesi.marvelcomicsuniverse.data.remote.model.Comic
import org.scesi.marvelcomicsuniverse.data.remote.model.Character

class HomeScreenViewModel : ViewModel() {

    private val repository = MarvelRepository()

    private val _comics = MutableStateFlow<List<Comic>>(emptyList())
    val comics: StateFlow<List<Comic>> = _comics

    private val _characters = MutableStateFlow<List<Character>>(emptyList())
    val characters: StateFlow<List<Character>> = _characters

    init {
        fetchComics()
        fetchCharacters()
    }

    private fun fetchComics() {
        viewModelScope.launch {
            try {
                val response = repository.getComics()
                if (response.isSuccessful) {
                    _comics.value = response.body()?.data?.results ?: emptyList()
                }
            } catch (e: Exception) {
                // Handle error
            }
        }
    }

    private fun fetchCharacters() {
        viewModelScope.launch {
            try {
                val response = repository.getCharacters()
                if (response.isSuccessful) {
                    _characters.value = response.body()?.data?.results ?: emptyList()
                }
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}
