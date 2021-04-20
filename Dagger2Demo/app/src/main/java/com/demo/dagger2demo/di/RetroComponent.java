package com.demo.dagger2demo.di;

import com.demo.dagger2demo.MainActivityViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {RetroModule.class})
public interface RetroComponent {

    public void inject(MainActivityViewModel mainActivityViewModel);
}
