package dog.shebang.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dog.shebang.navigation.databinding.ListFragmentBinding

class ListFragment : Fragment(R.layout.list_fragment) {
    private lateinit var binding: ListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ListFragmentBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            listToHomeButton.setOnClickListener {
                findNavController().navigate(R.id.action_listFragment_to_homeFragment)
            }
        }
    }
}