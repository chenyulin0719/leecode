class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.key_set = set()
        self.value_dict = {}  # dict = { key: (value, timestamp)}
        self.counter = 0

    def remove_lru_key(self):
        min_cnt = 2 * 10 ** 5 + 1
        for key in self.key_set:
            if self.value_dict[key][1] < min_cnt:
                min_cnt = self.value_dict[key][1]
                min_key = key
        self.key_set.remove(min_key)

    def get(self, key: int) -> int:
        if key not in self.key_set:
            return -1
        else:
            self.counter += 1
            self.value_dict[key] = (key, self.counter)
            return self.value_dict.get(key)[0]

    def put(self, key: int, value: int) -> None:
        self.counter += 1
        self.value_dict[key] = (value, self.counter)
        self.key_set.add(key)

        if len(self.key_set) > self.capacity:
            self.remove_lru_key()
