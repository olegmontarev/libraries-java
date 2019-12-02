package ru.geekbrains.gb_android_libraries;


import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    private Model model = new Model();


    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    public int calcValue(int index){
        model.setAt(index, model.getAt(index) + 1);
        return model.getAt(index);
    }

    public void counterClick(int id){
        switch (id) {
            case R.id.btnCounter1:
                getViewState().setButtonText(0, calcValue(0));
                break;
            case R.id.btnCounter2:
                getViewState().setButtonText(1, calcValue(1));
                break;
            case R.id.btnCounter3:
                getViewState().setButtonText(2, calcValue(2));
                break;
        }
    }
}
