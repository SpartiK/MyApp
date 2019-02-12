package internetStore;

import java.util.Arrays;

public class CategoryList {
    Category [] categories;

    public CategoryList(Category ... categories) {
        this.categories = new Category[categories.length];
        if (categories.length >= 0) System.arraycopy(categories, 0, this.categories, 0, categories.length);
    }
    public void categoryName(){
        for (Category category:categories
             ) {
            System.out.println(category.getCategoryName());
        }
    }



    @Override
    public String toString() {
        return "CategoryList{" +
                "categories=" + Arrays.toString(categories) +
                '}';
    }
}
