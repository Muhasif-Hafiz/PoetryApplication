import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhasib.mypoetry.databinding.RvItemBinding

class RvAdapter (var context :Context, var poemList :List<DataEntry>) : RecyclerView.Adapter<RvAdapter.viewHolder>(){


    class viewHolder(var binding : RvItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var view= RvItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return poemList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.binding.textView.text=poemList.get(position).poem
    }
}