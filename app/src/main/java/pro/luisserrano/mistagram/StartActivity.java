package pro.luisserrano.mistagram;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseUser;

import pro.luisserrano.mistagram.databinding.ActivityStartBinding;

public class StartActivity extends AppCompatActivity {

    Button login, register;
    FirebaseUser firebaseUser;
    private ActivityStartBinding binding;

    @Override
    protected void onStart() {
        super.onStart();

        //TODO(31) Inicializar firebaseUser al actual usuario de Firebase, si el usuario está autenticado (no es null) lanzar la actividad MainActivity y finalizar la actividad actual.


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        binding = ActivityStartBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //TODO(32): Crear dos listener para el evento click para login y register que lleven a LoginActivity y RegisterActivity respectivamente

    }
}