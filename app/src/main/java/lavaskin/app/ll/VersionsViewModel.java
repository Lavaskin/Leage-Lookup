package lavaskin.app.ll;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import lavaskin.app.ll.data.Versions;
import lavaskin.app.ll.data.VersionsRepository;

public class VersionsViewModel extends ViewModel {
    private VersionsRepository repository;
    private LiveData<Versions> patchVersions;

    public VersionsViewModel() {
        this.repository = new VersionsRepository();
        this.patchVersions = repository.getPatchVersions();
    }

    public LiveData<Versions> getPatchVersions() {
        return this.patchVersions;
    }

    public void loadVersions() {
        this.repository.loadVersion();
    }
}