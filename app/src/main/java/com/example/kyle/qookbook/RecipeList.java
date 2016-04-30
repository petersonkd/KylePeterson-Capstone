package com.example.kyle.qookbook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kyle.qookbook.recipes.ChickenNuggets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class RecipeList extends AppCompatActivity {

    private LinearLayout recipcont;
    private EditText recSearch;
    private ListView recipees;

    private ArrayList<reci> recipelist =new ArrayList<reci>();
    private MyAdapter  adapt;



    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recips);
        initialize();

        recSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapt.getFilter().filter(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
    private void initialize() {
        recSearch = (EditText) findViewById(R.id.recSearch);
        recipees = (ListView)findViewById(R.id.recipees);
        recipelist.add(new reci("Chicken Nuggets", "com.example.kyle.qookbook.recipes.ChickenNuggets"));
        recipelist.add(new reci("Chicken Pot Pie", "com.example.kyle.qookbook.recipes.ChickenPotPie"));
        recipelist.add(new reci("Pot Roast", "com.example.kyle.qookbook.recipes.PotRoast"));
        recipelist.add(new reci("Meatloaf", "com.example.kyle.qookbook.recipes.Meatloaf"));
        recipelist.add(new reci("Tater Tots", "com.example.kyle.qookbook.recipes.Tater"));
        recipelist.add(new reci("Fajitas", "com.example.kyle.qookbook.recipes.Fajitas"));
        recipelist.add(new reci("Cheeseburgers", "com.example.kyle.qookbook.recipes.Cheeseburger"));
        recipelist.add(new reci("Jambalaya", "com.example.kyle.qookbook.recipes.Jambalaya"));
        recipelist.add(new reci("Chicken Teriyaki", "com.example.kyle.qookbook.recipes.ChickenTeriyaki"));
        recipelist.add(new reci("Cinnamon Roll", "com.example.kyle.qookbook.recipes.CinnamonRoll"));
        recipelist.add(new reci("Grilled Cheese", "com.example.kyle.qookbook.recipes.GrilledCheese"));
        recipelist.add(new reci("Biscuits and Gravy","com.example.kyle.qookbook.recipes.Biscuitsn"));
        recipelist.add(new reci("California Roll","com.example.kyle.qookbook.recipes.Caliroll"));
        recipelist.add(new reci("Macaroni and Cheese","com.example.kyle.qookbook.recipes.MacNCheese"));
        recipelist.add(new reci("Crab Cakes","com.example.kyle.qookbook.recipes.CrabCakes"));
        recipelist.add(new reci("Clam Chowder","com.example.kyle.qookbook.recipes.Clamchow"));
        recipelist.add(new reci("Buffalo Wings","com.example.kyle.qookbook.recipes.Buffalowing"));
        recipelist.add(new reci("Black Bean Enchilada", "com.example.kyle.qookbook.vegrecipes.BlackBeanEnchi"));
        recipelist.add(new reci("Black Bean Burrito", "com.example.kyle.qookbook.vegrecipes.BlackBeanBur"));
        recipelist.add(new reci("Tomato Soup", "com.example.kyle.qookbook.veganrecipes.TomatoSoup"));
        recipelist.add(new reci("Roasted Brussel Sprouts", "com.example.kyle.qookbook.veganrecipes.RoastedBrussel"));
        recipelist.add(new reci("Tomato Chutney", "com.example.kyle.qookbook.veganrecipes.TomatoChut"));
        recipelist.add(new reci("Squash Risotto", "com.example.kyle.qookbook.veganrecipes.SquashR"));
        recipelist.add(new reci("Macaroni and Cheese","com.example.kyle.qookbook.recipes.MacNCheese"));
        recipelist.add(new reci("Veggie Gumbo", "com.example.kyle.qookbook.veganrecipes.Veggumbo"));
        recipelist.add(new reci("Sweet Potato Fritters", "com.example.kyle.qookbook.vegrecipes.SweetPotFrit"));
        recipelist.add(new reci("Black Bean Burger", "com.example.kyle.qookbook.vegrecipes.BlackBeanBur"));
        recipelist.add(new reci("Green Bean Casserole", "com.example.kyle.qookbook.vegrecipes.GreenBeencass"));
        recipelist.add(new reci("Potato Salad", "com.example.kyle.qookbook.vegrecipes.PotatoSalad"));
        recipelist.add(new reci("Corn Fritters", "com.example.kyle.qookbook.vegrecipes.Cornfritter"));
        recipelist.add(new reci("Mashed Potatos", "com.example.kyle.qookbook.vegrecipes.MashedPot"));
        recipelist.add(new reci("Grilled Pizza", "com.example.kyle.qookbook.vegrecipes.GrilledPizza"));
        recipelist.add(new reci("Havarti Souffle", "com.example.kyle.qookbook.vegrecipes.HavartiSouffle"));
        recipelist.add(new reci("Pea Salad", "com.example.kyle.qookbook.vegrecipes.Peasalad"));
        recipelist.add(new reci("Eggplant Lasagna", "com.example.kyle.qookbook.vegrecipes.Eggplantlas"));
        recipelist.add(new reci("Grilled Corn Cakes", "com.example.kyle.qookbook.vegrecipes.Grilledcorncake"));
        recipelist.add(new reci("Watermelon Cucumber Salad", "com.example.kyle.qookbook.veganrecipes.Watermeloncuc"));
        recipelist.add(new reci("Broccoli Quinoa Casserole", "com.example.kyle.qookbook.vegrecipes.BroccoliQin"));
        recipelist.add(new reci("Squash and Peanut Stew", "com.example.kyle.qookbook.veganrecipes.Squashnp"));
        recipelist.add(new reci("Veggie Stir Fry", "com.example.kyle.qookbook.veganrecipes.Vegstirfry"));
        recipelist.add(new reci("Spinach Herb Pesto", "com.example.kyle.qookbook.vegrecipes.Spinachherbpesto"));
        recipelist.add(new reci("Tofu Taco", "com.example.kyle.qookbook.vegrecipes.Tofutaco"));
        recipelist.add(new reci("Tofu Taco", "com.example.kyle.qookbook.vegrecipes.SweetPotFrit"));
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();





        adapt= new MyAdapter(RecipeList.this, recipelist);
        recipees.setAdapter(adapt);

    }

    public class MyAdapter extends BaseAdapter implements Filterable {
        private ArrayList<reci> mOriginalValues; // Original Values
        private ArrayList<reci> mDisplayedValues;    // Values to be displayed
        LayoutInflater inflater;

        public MyAdapter(Context context, ArrayList<reci> mProductArrayList) {
            this.mOriginalValues = recipelist;
            this.mDisplayedValues = recipelist;
            inflater = LayoutInflater.from(context);
        }


        @Override
        public int getCount() {
            return mDisplayedValues.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        private class ViewHolder {
            LinearLayout recipcont;

            TextView recipname;
            Button reciplink;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent){


            ViewHolder holder = null;
            if (convertView == null) {
               // adapt.clear();
                //LinearLayout view=(LinearLayout)LinearLayout.inflate(getApplicationContext(),R.layout.activity_main,null);
                holder = new ViewHolder();
                convertView = inflater.inflate(R.layout.row, null);
                holder.recipcont = (LinearLayout)convertView.findViewById(R.id.recipcont);
                holder.recipname = (TextView) convertView.findViewById(R.id.recipname);
                convertView.setTag(holder);
                //adapt.notifyDataSetChanged();
                recipees.deferNotifyDataSetChanged();
                //recipees.setNotifyOnChange(false);
                Button butt=(Button)convertView.findViewById(R.id.getbutt);

                butt.setTag(position);


                butt.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        int check=-1;
                        int checker=4;
                        Object obj=v.getTag();
                        if(obj instanceof Integer){
                            check=((Integer)obj).intValue();
                        }
                        if(check>-1){
                            String linky=recipelist.get(check).getLink();


//                        Intent intent = new Intent();
//                        intent.setClassName(mDisplayedValues.get(position).link);
//                        startActivity(intent);
                        try {
                            startActivity(new Intent(RecipeList.this, Class.forName(linky)));
                            //Toast.makeText(getApplicationContext(), recipelist.get(checker).getLink(), Toast.LENGTH_SHORT).show();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        }
                    }


                });
            }
            else {
                holder = (ViewHolder) convertView.getTag();

            }

           //Button reciplink=(Button)findViewById(R.id.getbutt);


            holder.recipname.setText(mDisplayedValues.get(position).name);
            return convertView;
        }
        @Override
        public Filter getFilter() {
            Filter filter = new Filter() {

                @SuppressWarnings("unchecked")
                @Override
                protected void publishResults(CharSequence constraint,Filter.FilterResults results) {

                    mDisplayedValues = (ArrayList<reci>) results.values; // has the filtered values
                    notifyDataSetChanged();  // notifies the data with new filtered values
                }

                @Override
                protected FilterResults performFiltering(CharSequence constraint) {
                    FilterResults results = new FilterResults();        // Holds the results of a filtering operation in values
                    ArrayList<reci> FilteredArrList = new ArrayList<reci>();

                    if (mOriginalValues == null) {
                        mOriginalValues = new ArrayList<reci>(mDisplayedValues); // saves the original data in mOriginalValues
                    }

                    /********
                     *
                     *  If constraint(CharSequence that is received) is null returns the mOriginalValues(Original) values
                     *  else does the Filtering and returns FilteredArrList(Filtered)
                     *
                     ********/
                    if (constraint == null || constraint.length() == 0) {

                        // set the Original result to return
                        results.count = mOriginalValues.size();
                        results.values = mOriginalValues;
                    } else {
                        constraint = constraint.toString().toLowerCase();
                        for (int i = 0; i < mOriginalValues.size(); i++) {
                            String data = mOriginalValues.get(i).name;
                            if (data.toLowerCase().startsWith(constraint.toString())) {
                                FilteredArrList.add(new reci(mOriginalValues.get(i).name,mOriginalValues.get(i).linky));
                            }
                        }
                        // set the Filtered result to return
                        results.count = FilteredArrList.size();
                        results.values = FilteredArrList;
                    }
                    return results;
                }
            };
            return filter;
        }
    }
}
