package gradle.udacity.com.jokeandroidlibrary;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {

    private final String LOG_TAG = JokeActivityFragment.class.getName();

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joke, container, false);

        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokeActivity.KEY);

        TextView textView = (TextView) view.findViewById(R.id.joke);

        textView.setText(joke);

        return view;
    }
}
